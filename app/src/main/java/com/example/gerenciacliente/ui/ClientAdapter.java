package com.example.gerenciacliente.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciacliente.R;

import java.util.List;

public class ClientAdapter extends RecyclerView.Adapter<ClientViewHolder> {
	private final Context context;
	private List<Client> clientList;
	public interface OnItemClickListener {
		void onItemClick(int position);
	}
	private OnItemClickListener listener;
	public void setOnItemClickListener(OnItemClickListener listener) {
		this.listener = listener;
	}
	public ClientAdapter(Context context, List<Client> clientList) {
		this.context = context;
		this.clientList = clientList;
	}

	@Override
	public ClientViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View itemView = LayoutInflater.from(context).inflate(R.layout.client_item_layout, parent, false);
		return new ClientViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(ClientViewHolder holder, int position) {
		Client currentClient = clientList.get(position);
		holder.textClientName.setText(currentClient.getName());
		holder.textClientAddress.setText(currentClient.getAddress());
		holder.textClientPhone.setText(currentClient.getPhoneNumber());
		holder.itemView.setOnClickListener(v -> {
			if (listener != null) {
				listener.onItemClick(position);
			}
		});
	}

	@Override
	public int getItemCount() {
		return clientList == null ? 0 : clientList.size();
	}
	public void updateList(List<Client> newList) {
		clientList = newList;
		notifyDataSetChanged();
	}
	public void addItem(Client client) {
		clientList.add(client);
		notifyItemInserted(clientList.size() - 1);
	}
	public void removeItem(int position) {
		clientList.remove(position);
		notifyItemRemoved(position);
	}
}