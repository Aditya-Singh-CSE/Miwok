package android.example.miwokfinal;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
//Resource ID for background color for this list of words
    private int mColorResourceId;

   // public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
   public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        //   int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //   miwokTextView.setBackgroundColor(color);

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView=(ImageView) listItemView.findViewById(R.id.image);
        //Check if an image is provided for this word or not
        if(currentWord.hasImage()){
            //if an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is VISIBLE
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            // Otherwise hide the imageView (Set visibility GONE)
           imageView.setVisibility(View.GONE);
        }

        //set the theme color for listItem
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        //Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        // return the whole list item layout(Containing 2 TextViews) so that it can be shown in the ListView
        return listItemView;
    }
}
 //       defaultTextView.setBackgroundColor(color);




