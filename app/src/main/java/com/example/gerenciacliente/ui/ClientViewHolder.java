package com.example.gerenciacliente.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gerenciacliente.R;

public class ClientViewHolder extends RecyclerView.ViewHolder {
	public final TextView textClientName;
	public final TextView textClientAddress;
	public final TextView textClientPhone;

	public ClientViewHolder(View itemView) {
		super(itemView);
		textClientName = itemView.findViewById(R.id.text_client_name);
		textClientAddress = itemView.findViewById(R.id.text_client_address);
		textClientPhone = itemView.findViewById(R.id.text_client_phone);
		itemView.setOnClickListener(v -> {
			int position = getAdapterPosition();

		});
	}
}