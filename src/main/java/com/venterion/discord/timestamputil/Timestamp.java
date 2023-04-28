package com.venterion.discord.timestamputil;

/**
 * Provides all methods for generating Discord timestamp markdowns.
 */
public class Timestamp {

    /**
     * The available formats how the markdown should be displayed.
     */
    public enum Format {

        /**
         * The short time format.
         * <p>e.g.: 9:30 AM
         */
        SHORT_TIME("t"),

        /**
         * The long time format.
         * <p>e.g.: 9:30:45 AM</p>
         */
        LONG_TIME("T"),

        /**
         * The short date format.
         * <p>e.g.: 07/02/2022</p>
         */
        SHORT_DATE("d"),

        /**
         * The long date format.
         * <p>e.g.: July 2, 2022</p>
         */
        LONG_DATE("D"),

        /**
         * The long date format with short time displayed.
         * <p>e.g.: July 2, 2022 9:31 AM</p>
         */
        SHORT_DATE_WITH_TIME("f"),

        /**
         * The full date with day of the week, date and short time.
         * <p>e.g.: Saturday, July 2, 2022 9:31 AM</p>
         */
        LONG_DATE_WITH_TIME("F"),

        /**
         * The minutes passed or ahead of the current time.
         * <p>e.g.: 6 minutes ago</p>
         * <p>e.g.: in 4 months</p>
         */
        RELATIVE("R");

        private String id;

        Format(String id) {
            this.id = id;
        }

        /**
         * Gets the Discord identifier of the format.
         *
         * @return The Discord identifier of the format.
         */
        public String getId() {
            return id;
        }
    }

    /**
     * Gets the Discord markdown of the current time with the default format (short date with time).
     *
     * @return The Discord markdown of the current time with the default format.
     */
    public static String now() {
        return get(System.currentTimeMillis() / 1000, Format.SHORT_DATE_WITH_TIME);
    }

    /**
     * Gets the Discord markdown of the given time with the default format (short date with time).
     *
     * @param timestamp The timestamp.
     * @return The Discord markdown of the given time with the default format.
     */
    public static String get(long timestamp) {
        return get(timestamp, Format.SHORT_DATE_WITH_TIME);
    }

    /**
     * Gets the Discord markdown of the current time with the given format.
     *
     * @param format The format.
     * @return The Discord markdown of the current time with the given format.
     */
    public static String get(Format format) {
        return get(System.currentTimeMillis() / 1000, format);
    }

    /**
     * Gets the Discord markdown of the given time with the given format.
     *
     * @param timestamp The timestamp in seconds.
     * @param format The format.
     * @return The Discord markdown of the given time with the given format.
     */
    public static String get(long timestamp, Format format) {
        return "<t:%d:%s>".formatted(timestamp, format.getId());
    }
}
