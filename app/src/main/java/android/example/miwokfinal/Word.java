package android.example.miwokfinal;

public class Word {

    //Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation of the word
    private String mMiwokTranslation;

    //Image resource ID for the word
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    //Audio resource ID for the word
    private int mAudioResourceId;

    /**
     *
     * @param Defaulttranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param MiwokTranslation is the word in the Miwok language
     * @param ImageResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String Defaulttranslation, String MiwokTranslation,int ImageResourceId,int audioResourceId) {
        mDefaultTranslation = Defaulttranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId=ImageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String Defaulttranslation, String MiwokTranslation,int audioResourceId) {
        mDefaultTranslation = Defaulttranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceId = audioResourceId;

    }

    //get the default translation of the word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //get the miwok transltion of the word
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /*8
    Return the image resource ID of the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /*
    Return whether or not there is an image for this word
     */
    public boolean hasImage(){
       return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

    /*
    Return the audio resource ID of the word
     */
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}