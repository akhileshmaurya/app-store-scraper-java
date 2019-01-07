
package net.akhilesh.constant;

public enum AppCollections {
  TOP_MAC("macos-apps/top-mac-apps/all"), TOP_FREE_MAC(
      "macos-apps/top-free-mac-apps/all"), TOP_GROSSING_MAC(
          "macos-apps/top-grossing-mac-apps/all"), TOP_PAID_MAC(
              "macos-apps/top-paid-mac-apps/all"), NEW_APPS_IOS(
                  "ios-apps/new-apps-we-love/all"), NEW_GAMES_IOS(
                      "ios-apps/new-games-we-love/all"), TOP_FREE_IOS(
                          "ios-apps/top-free/all"), TOP_FREE_GAMES_IOS(
                              "ios-apps/top-free/games"), TOP_FREE_IPAD(
                                  "ios-apps/top-free-ipad/all"), TOP_GROSSING_IOS(
                                      "ios-apps/top-grossing/all"), TOP_GROSSING_IPAD(
                                          "ios-apps/top-grossing-ipad/all"), TOP_PAID_IOS(
                                              "ios-apps/top-paid/all"), TOP_PAID_GAMES_IOS(
                                                  "ios-apps/top-paid/games");
  String name;

  AppCollections(String name) {
    this.name = name;
  }

}
