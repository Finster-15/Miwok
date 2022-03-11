package com.example.miwok;

import android.graphics.drawable.Drawable;

/**
 * {@link Word} represents a class containing Default(English)
 * and Miwok Translation for that word.
 */
public class Word {

    /** Default translation of the word. */
    private String mDefaultTranslation;
    /** Miwok translation of the word. */
    private String mMiwokTranslation;
    /** Drawable resource ID. */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Audio resource ID. */
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     * @param defaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    /**
     * Create a new Word object.
     * @param defaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /** Get the Default Translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get the Miwok Translation of the word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    
    /** Get the image resource id of the corresponding word */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /** Get the audio resource id of the corresponding word */
    public  int getAudioResourceId() { return mAudioResourceId; }

    /** Return whether or not there is an image for this word */
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

}
