/*
 * SPDX-FileCopyrightText: 2015, The CyanogenMod Project
 * SPDX-FileCopyrightText: The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */
package strixos.app;

import android.annotation.SdkConstant;

/**
 * @hide TODO: We need to somehow make these managers accessible via
 * getSystemService
 */
public final class LineageContextConstants {

    /**
     * @hide
     */
    private LineageContextConstants() {
        // Empty constructor
    }

    /**
     * Use with {@link android.content.Context#getSystemService} to retrieve a
     * {@link strixos.app.ProfileManager} for informing the user of background
     * events.
     *
     * @see android.content.Context#getSystemService
     * @see strixos.app.ProfileManager
     *
     * @hide
     */
    public static final String LINEAGE_PROFILE_SERVICE = "losprofile";

    /**
     * Use with {@link android.content.Context#getSystemService} to retrieve a
     * {@link strixos.hardware.LineageHardwareManager} to manage the extended
     * hardware features of the device.
     *
     * @see android.content.Context#getSystemService
     * @see strixos.hardware.LineageHardwareManager
     *
     * @hide
     */
    public static final String LINEAGE_HARDWARE_SERVICE = "loshardware";

    /**
     * Manages display color adjustments
     *
     * @hide
     */
    public static final String LINEAGE_LIVEDISPLAY_SERVICE = "loslivedisplay";

    /**
     * Use with {@link android.content.Context#getSystemService} to retrieve a
     * {@link strixos.trust.TrustInterface} to access the Trust interface.
     *
     * @see android.content.Context#getSystemService
     * @see strixos.trust.TrustInterface
     *
     * @hide
     */
    public static final String LINEAGE_TRUST_INTERFACE = "lostrust";

    /**
     * Use with {@link android.content.Context#getSystemService} to retrieve a
     * {@link strixos.health.HealthInterface} to access the Health interface.
     *
     * @see android.content.Context#getSystemService
     * @see strixos.health.HealthInterface
     *
     * @hide
     */
    public static final String LINEAGE_HEALTH_INTERFACE = "loshealth";

    /**
     * Update power menu (GlobalActions)
     *
     * @hide
     */
    public static final String LINEAGE_GLOBAL_ACTIONS_SERVICE = "losglobalactions";

    /**
     * Use to access the Sensitive Phone Numbers service.
     *
     * @hide
     */
    public static final String LINEAGE_SENSITIVE_PHONE_NUMBERS_SERVICE = "lossensitivephone";

    /**
     * Features supported by the Lineage SDK.
     */
    public static class Features {

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the
         * hardware abstraction framework service utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String HARDWARE_ABSTRACTION = "org.los.hardware";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the
         * lineage profiles service utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String PROFILES = "org.los.profiles";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the
         * LiveDisplay service utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String LIVEDISPLAY = "org.los.livedisplay";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the
         * lineage trust service utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String TRUST = "org.los.trust";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the
         * lineage settings service utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String SETTINGS = "org.los.settings";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the
         * lineage globalactions service utilized by the lineage sdk and
         * LineageParts.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String GLOBAL_ACTIONS = "org.los.globalactions";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the
         * lineage health service utilized by the lineage sdk and LineageParts.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String HEALTH = "org.los.health";
    }
}
