package sg.edu.np.mad.s10208161.practical2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder{
    public TextView name;
    public TextView desc;
    public ImageView displayPicture;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.userNameTV);
        desc = itemView.findViewById(R.id.userDescTV);
        displayPicture = itemView.findViewById(R.id.displayImg);
    }
}
