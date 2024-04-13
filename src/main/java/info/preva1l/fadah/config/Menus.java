package info.preva1l.fadah.config;


import com.google.common.collect.ImmutableList;
import info.preva1l.fadah.Fadah;
import info.preva1l.fadah.utils.BasicConfig;
import info.preva1l.fadah.utils.StringUtils;
import lombok.AllArgsConstructor;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
public enum Menus {
    MAIN_TITLE("main.title", "&9&lAuction House"),
    MAIN_LISTING_LORE("main.listing.lore-body", List.of(
            "&8&n---------------------------",
            "&fSeller: &e{0}",
            "&fCategory: &e{1}",
            "&r ",
            "&fBuy Now: &6${2}",
            "&r ",
            "&fExpires In: &e{3}",
            "&8&n---------------------------")),
    MAIN_LISTING_FOOTER_BUY("main.listing.lore-footer.buy", "&aClick to buy now!"),
    MAIN_LISTING_FOOTER_EXPENSIVE("main.listing.lore-footer.too-expensive", "&cYou cannot afford this item!"),
    MAIN_LISTING_FOOTER_OWN_LISTING("main.listing.lore-footer.own-listing", "&cYou cannot buy your own listing! &8(Shift Click to Cancel)"),
    MAIN_PROFILE_NAME("main.profile-button.name", "&e&lYour Profile"),
    MAIN_PROFILE_LORE("main.profile-button.lore", Collections.singletonList("&fClick to view your profile!")),
    MAIN_PROFILE_DESCRIPTION("main.profile-button.description", List.of("&fThis is your profile!", "&fHere you will find items from the auction house relating to you.")),
    MAIN_SEARCH_NAME("main.filter.search.name", "&3&lSearch"),
    MAIN_SEARCH_LORE("main.filter.search.lore", Collections.singletonList("&fClick to search for an item name/type!")),
    MAIN_FILTER_TYPE_NAME("main.filter.change-type.name", "&eListing Filter"),
    MAIN_FILTER_TYPE_LORE("main.filter.change-type.lore", List.of(
            "&7Left Click to cycle up",
            "&7Right Click to cycle down",
            "&8-------------------------",
            "&f{0}",
            "&8> &e{1}",
            "&f{2}",
            "&8-------------------------"
    )),

    MAIN_FILTER_DIRECTION_NAME("main.filter.change-direction.name", "&eFilter Direction"),
    MAIN_FILTER_DIRECTION_LORE("main.filter.change-direction.lore", List.of(
            "&7Click To Toggle",
            "&8-------------------------",
            "{0}",
            "{1}",
            "&8-------------------------"
    )),
    MAIN_FILTER_DIRECTION_SELECTED("main.filter.change-direction.options.selected", "&8> &e{0}"),
    MAIN_FILTER_DIRECTION_NOT_SELECTED("main.filter.change-direction.options.not-selected", "&f{0}"),

    SEARCH_TITLE("search.title", "&9&lAuction House &8> &fSearch"),
    NEW_LISTING_TITLE("new-listing.title", "&9&lAuction House &8> &3New Listing"),
    NEW_LISTING_CREATE_NAME("new-listing.create.title", "&aClick to create listing!"),
    NEW_LISTING_CREATE_LORE("new-listing.create.lore", List.of(
            "&cClicking this button will immediately post",
            "&cyour item on the auction house for &a${0}")),
    NEW_LISTING_TIME_NAME("new-listing.time.title", "&aTime for listing to be active"),
    NEW_LISTING_TIME_LORE("new-listing.time.lore", List.of(
            "&fCurrent: &6{0}",
            "&7Left Click to Add 1 Hour",
            "&7Right Click to Remove 1 Hour",
            "&7Shift Left Click to Add 30 Minutes",
            "&7Shift Right Click to Remove 30 Minutes")),

    CONFIRM_TITLE("confirm.title", "&9&lAuction House &8> &aConfirm Purchase"),

    PROFILE_TITLE("profile.title", "&9&lAuction House &8> &bYour Profile"),
    PROFILE_COLLECTION_BOX_NAME("profile.collection-box.name", "&eCollection Box"),
    PROFILE_COLLECTION_BOX_LORE("profile.collection-box.lore", List.of(
            "&fClick to view & claim",
            "&fyour purchases!")),
    PROFILE_EXPIRED_LISTINGS_NAME("profile.expired-listings.name", "&cExpired Listings"),
    PROFILE_EXPIRED_LISTINGS_LORE("profile.expired-listings.lore", List.of(
            "&fClick to view & claim",
            "&fyour expired listings!")),

    COLLECTION_BOX_TITLE("collection-box.title", "&9&lAuction House &8> &eCollection Box"),
    COLLECTION_BOX_LORE("collection-box.collectable-lore", List.of(
            "&8&n---------------------------",
            "&fAdded: &e{0} &fago",
            "&r ",
            "&eClick To Claim!",
            "&8&n---------------------------"
    )),

    EXPIRED_LISTINGS_TITLE("expired-listings.title", "&9&lAuction House &8> &cExpired Listings"),
    EXPIRED_LISTINGS_LORE("expired-listings.collectable-lore", List.of(
            "&8&n---------------------------",
            "&fAdded: &e{0} &fago",
            "&r ",
            "&eClick To Re-Claim!",
            "&8&n---------------------------"
    )),

    NO_ITEM_FOUND_NAME("no-items-found.name", "&c&lNo items found!"),
    NO_ITEM_FOUND_LORE("no-items-found.lore", Collections.emptyList()),

    BACK_BUTTON_NAME("all.back.name", "&cGo Back"),
    BACK_BUTTON_LORE("all.back.lore", Collections.singletonList("&7Click to go back")),
    PREVIOUS_BUTTON_NAME("all.previous_page.name", "&c&lPrevious Page"),
    PREVIOUS_BUTTON_LORE("all.previous_page.lore", Collections.singletonList("&7Click to go to the previous page")),
    NEXT_BUTTON_NAME("all.next_page.name", "&a&lNext Page"),
    NEXT_BUTTON_LORE("all.next_page.lore", Collections.singletonList("&7Click to go to the next page")),
    SCROLL_NEXT_BUTTON_NAME("all.scroll_next.name", "&a&lScroll Categories Down"),
    SCROLL_NEXT_BUTTON_LORE("all.scroll_next.lore", Collections.singletonList("&7Click to move the categories down")),
    SCROLL_PREVIOUS_BUTTON_NAME("all.scroll_previous.name", "&a&lScroll Categories Up"),
    SCROLL_PREVIOUS_BUTTON_LORE("all.scroll_previous.lore", Collections.singletonList("&7Click to move the categories up")),
    CLOSE_BUTTON_NAME("all.close.name", "&c&l✗ Close"),
    CLOSE_BUTTON_LORE("all.close.lore", Collections.singletonList("&7Click to close the menu")),
    CONFIRM_BUTTON_NAME("all.confirm.name", "&a&lCONFIRM"),
    CONFIRM_BUTTON_LORE("all.confirm.lore", Collections.singletonList("&7Click to confirm")),
    CANCEL_BUTTON_NAME("all.cancel.name", "&c&lCANCEL"),
    CANCEL_BUTTON_LORE("all.cancel.lore", Collections.singletonList("&7Click to cancel")),
    BORDER_LORE("menu-border-lore", Collections.singletonList("&8play.dxtrus.net")),
    ;

    private final String path;
    private final Object defaultValue;

    public String toString() {
        String str = Fadah.getINSTANCE().getMenusFile().getString(path);
        if (str.equals(path)) {
            return defaultValue.toString();
        }
        return str;
    }

    public String toFormattedString() {
        String str = Fadah.getINSTANCE().getMenusFile().getString(path);
        if (str.equals(path)) {
            return StringUtils.colorize(defaultValue.toString());
        }
        return StringUtils.colorize(str);
    }

    public String toFormattedString(Object... replacements) {
        String str = Fadah.getINSTANCE().getMenusFile().getString(path);
        if (str.equals(path)) {
            return StringUtils.formatPlaceholders(StringUtils.colorize(defaultValue.toString()), replacements);
        }
        return StringUtils.colorize(StringUtils.formatPlaceholders(str, replacements));
    }

    public List<String> toStringList() {
        List<String> str = Fadah.getINSTANCE().getMenusFile().getStringList(path);
        if (str.isEmpty() || str.get(0).equals(path)) {
            return (List<String>) defaultValue;
        }
        if (str.get(0).equals("null")) {
            return ImmutableList.of();
        }
        return str;
    }

    public List<String> toLore() {
        List<String> str = Fadah.getINSTANCE().getMenusFile().getStringList(path);
        if (str.isEmpty() || str.get(0).equals(path)) {
            List<String> ret = new ArrayList<>();
            for (String line : (List<String>) defaultValue) ret.add(StringUtils.formatPlaceholders(line));
            return StringUtils.colorizeList(ret);
        }
        if (str.get(0).equals("null")) {
            return ImmutableList.of();
        }
        List<String> ret = new ArrayList<>();
        for (String line : str) ret.add(StringUtils.formatPlaceholders(line));
        return StringUtils.colorizeList(ret);
    }

    public List<String> toLore(Object... replacements) {
        List<String> str = Fadah.getINSTANCE().getMenusFile().getStringList(path);
        if (str.isEmpty() || str.get(0).equals(path)) {
            List<String> ret = new ArrayList<>();
            for (String line : (List<String>) defaultValue) ret.add(StringUtils.formatPlaceholders(line, replacements));
            return StringUtils.colorizeList(ret);
        }
        if (str.get(0).equals("null")) {
            return ImmutableList.of();
        }
        List<String> ret = new ArrayList<>();
        for (String line : str) {
            ret.add(StringUtils.formatPlaceholders(line, replacements));
        }
        return StringUtils.colorizeList(ret);
    }

    public boolean toBoolean() {
        return Boolean.parseBoolean(toString());
    }

    public int toInteger() {
        return Integer.parseInt(toString());
    }

    public double toDouble() {
        return Double.parseDouble(toString());
    }

    public static void loadDefault() {
        BasicConfig configFile = Fadah.getINSTANCE().getMenusFile();

        for (Menus config : Menus.values()) {
            String path = config.path;
            String str = configFile.getString(path);
            if (str.equals(path)) {
                configFile.getConfiguration().set(path, config.defaultValue);
            }
        }

        configFile.save();
        configFile.load();
    }
}
