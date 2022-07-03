package com.scriptwritr.model.builder.interfaces;

import com.scriptwritr.model.*;
import com.scriptwritr.model.builder.builders.SceneHeading;
import com.scriptwritr.model.builder.products.SceneHeadingProduct;

/**
 * @author Carl Karama
 */
public interface SceneHeadingBuilder {

    /**
     *
     * @param setting
     *        An enum that defines whether the character is inside or outside or a combination of both
     * @return SceneHeading
     */
    public SceneHeading buildSceneHeadingSetting(Setting setting);

    /**
     *
     * @param location
     *        The scene's general location
     * @return SceneHeading
     */
    public SceneHeading buildSceneHeadingLocation(Location location);

    /**
     *
     * @param property
     *        An enum specifying the type of property in the scene heading
     * @return SceneHeading
     */
    public SceneHeading buildSceneHeadingProperty(Property property);

    /**
     *
     * @param place
     *        A specifier that emphasizes a characters location
     * @return Place
     */
    public SceneHeading buildSceneHeadingLocationModifier(Place place);

    /**
     *
     * @param establishment
     *        An enum specifying the type of establishment for the scene.
     * @return SceneHeading
     */
    public SceneHeading buildSceneHeadingEstablishment(Establishment establishment);

    /**
     *
     * @param scenetime
     *        An enum denoting when the scene takes place. It can be DAY or NIGHT
     * @return SceneHeading
     */
    public SceneHeading buildSceneTime(SceneHeadingTime scenetime);

    /**
     *
     * @param sceneHeadingTimeModifier
     *        An enum modifier that emphasizes when the scene takes place.
     * @return SceneHeading
     */
    public SceneHeading buildSceneTimeModifier(SceneHeadingTimeModifier sceneHeadingTimeModifier);

    /**
     *
     * @param timePeriod
     *        The time period when the scene heading is taking place e.g. 2020
     * @return SceneHeading
     */
    public SceneHeading buildSceneTimePeriod(TimePeriod timePeriod);

    /**
     *
     * @param locality
     *        A city, district or town the scene is taking place in
     * @return SceneHeading
     */
    public SceneHeading buildSceneHeadingLocality(Locality locality);

    /**
     * @param flashback
     *        A text denoting a flashback
     * @return SceneHeading
     */
    public SceneHeading buildSceneHeadingFlashback(Flashback flashback);

    /**
     * Delivers the final scene heading
     * @return SceneHeading
     */
    public SceneHeadingProduct getSceneHeading();
}
