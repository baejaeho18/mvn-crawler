(function (root, factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports', 'kotlin', 'kotlin-js', '@jetbrains/ring-ui/components/dialog/dialog', '@jetbrains/ring-ui/components/dropdown/dropdown', '@jetbrains/ring-ui/components/island/island', '@jetbrains/ring-ui/components/tabs/tabs'], factory);
  else if (typeof exports === 'object')
    factory(module.exports, require('kotlin'), require('kotlin-js'), require('@jetbrains/ring-ui/components/dialog/dialog'), require('@jetbrains/ring-ui/components/dropdown/dropdown'), require('@jetbrains/ring-ui/components/island/island'), require('@jetbrains/ring-ui/components/tabs/tabs'));
  else {
    if (typeof kotlin === 'undefined') {
      throw new Error("Error loading module 'kotlin-ring-ui'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'kotlin-ring-ui'.");
    }
    if (typeof this['kotlin-js'] === 'undefined') {
      throw new Error("Error loading module 'kotlin-ring-ui'. Its dependency 'kotlin-js' was not found. Please, check whether 'kotlin-js' is loaded prior to 'kotlin-ring-ui'.");
    }
    if (typeof this['@jetbrains/ring-ui/components/dialog/dialog'] === 'undefined') {
      throw new Error("Error loading module 'kotlin-ring-ui'. Its dependency '@jetbrains/ring-ui/components/dialog/dialog' was not found. Please, check whether '@jetbrains/ring-ui/components/dialog/dialog' is loaded prior to 'kotlin-ring-ui'.");
    }
    if (typeof this['@jetbrains/ring-ui/components/dropdown/dropdown'] === 'undefined') {
      throw new Error("Error loading module 'kotlin-ring-ui'. Its dependency '@jetbrains/ring-ui/components/dropdown/dropdown' was not found. Please, check whether '@jetbrains/ring-ui/components/dropdown/dropdown' is loaded prior to 'kotlin-ring-ui'.");
    }
    if (typeof this['@jetbrains/ring-ui/components/island/island'] === 'undefined') {
      throw new Error("Error loading module 'kotlin-ring-ui'. Its dependency '@jetbrains/ring-ui/components/island/island' was not found. Please, check whether '@jetbrains/ring-ui/components/island/island' is loaded prior to 'kotlin-ring-ui'.");
    }
    if (typeof this['@jetbrains/ring-ui/components/tabs/tabs'] === 'undefined') {
      throw new Error("Error loading module 'kotlin-ring-ui'. Its dependency '@jetbrains/ring-ui/components/tabs/tabs' was not found. Please, check whether '@jetbrains/ring-ui/components/tabs/tabs' is loaded prior to 'kotlin-ring-ui'.");
    }
    root['kotlin-ring-ui'] = factory(typeof this['kotlin-ring-ui'] === 'undefined' ? {} : this['kotlin-ring-ui'], kotlin, this['kotlin-js'], this['@jetbrains/ring-ui/components/dialog/dialog'], this['@jetbrains/ring-ui/components/dropdown/dropdown'], this['@jetbrains/ring-ui/components/island/island'], this['@jetbrains/ring-ui/components/tabs/tabs']);
  }
}(this, function (_, Kotlin, $module$kotlin_js, $module$_jetbrains_ring_ui_components_dialog_dialog, $module$_jetbrains_ring_ui_components_dropdown_dropdown, $module$_jetbrains_ring_ui_components_island_island, $module$_jetbrains_ring_ui_components_tabs_tabs) {
  'use strict';
  var $$importsForInline$$ = _.$$importsForInline$$ || (_.$$importsForInline$$ = {});
  var defineInlineFunction = Kotlin.defineInlineFunction;
  var Unit = Kotlin.kotlin.Unit;
  var get_error = defineInlineFunction('kotlin-ring-ui.ringui.get_error_j0e1ob$', function ($receiver) {
    return 'error';
  });
  var get_message = defineInlineFunction('kotlin-ring-ui.ringui.get_message_j0e1ob$', function ($receiver) {
    return 'message';
  });
  var get_success = defineInlineFunction('kotlin-ring-ui.ringui.get_success_j0e1ob$', function ($receiver) {
    return 'success';
  });
  var get_warning = defineInlineFunction('kotlin-ring-ui.ringui.get_warning_j0e1ob$', function ($receiver) {
    return 'warning';
  });
  var get_loading = defineInlineFunction('kotlin-ring-ui.ringui.get_loading_j0e1ob$', function ($receiver) {
    return 'loading';
  });
  var Color = defineInlineFunction('kotlin-ring-ui.ringui.Color_i3nxhr$', function (r, g, b) {
    var $receiver = {};
    $receiver.r = r;
    $receiver.g = g;
    $receiver.b = b;
    return $receiver;
  });
  function Dialog$lambda(closure$show, closure$handler) {
    return function ($receiver) {
      $receiver.attrs.show = closure$show;
      closure$handler($receiver);
      return Unit;
    };
  }
  function Dialog($receiver, show, handler) {
    $receiver.invoke_qk0v40$($module$_jetbrains_ring_ui_components_dialog_dialog.default, Dialog$lambda(show, handler));
  }
  function Dropdown$lambda(closure$anchor, closure$handler) {
    return function ($receiver) {
      $receiver.attrs.anchor = closure$anchor;
      closure$handler($receiver);
      return Unit;
    };
  }
  function Dropdown($receiver, anchor, handler) {
    $receiver.invoke_qk0v40$($module$_jetbrains_ring_ui_components_dropdown_dropdown.default, Dropdown$lambda(anchor, handler));
  }
  var IFooterItem = defineInlineFunction('kotlin-ring-ui.ringui.IFooterItem_61zpoe$', function (string) {
    return string;
  });
  function Island$lambda$lambda(closure$header) {
    return function ($receiver) {
      $receiver.attrs.border = true;
      $receiver.unaryPlus_pdl1vz$(closure$header);
      return Unit;
    };
  }
  function Island$lambda(closure$header, closure$handler) {
    return function ($receiver) {
      $receiver.invoke_qk0v40$($module$_jetbrains_ring_ui_components_island_island.Header, Island$lambda$lambda(closure$header));
      $receiver.invoke_qk0v40$($module$_jetbrains_ring_ui_components_island_island.Content, closure$handler);
      return Unit;
    };
  }
  function Island($receiver, header, handler) {
    $receiver.invoke_qk0v40$($module$_jetbrains_ring_ui_components_island_island.default, Island$lambda(header, handler));
  }
  function get_dataTest($receiver) {
    return $receiver['data-test'];
  }
  function set_dataTest($receiver, value) {
    $receiver['data-test'] = value;
  }
  var get_xs = defineInlineFunction('kotlin-ring-ui.ringui.get_xs_gel720$', function ($receiver) {
    return 'xs';
  });
  var get_sm = defineInlineFunction('kotlin-ring-ui.ringui.get_sm_gel720$', function ($receiver) {
    return 'sm';
  });
  var get_md = defineInlineFunction('kotlin-ring-ui.ringui.get_md_gel720$', function ($receiver) {
    return 'md';
  });
  var get_lg = defineInlineFunction('kotlin-ring-ui.ringui.get_lg_gel720$', function ($receiver) {
    return 'lg';
  });
  function Tabs$lambda(closure$active, closure$handler) {
    return function ($receiver) {
      if (closure$active != null) {
        $receiver.attrs.selected = closure$active;
      }
      closure$handler($receiver);
      return Unit;
    };
  }
  function Tabs($receiver, active, handler) {
    $receiver.invoke_qk0v40$($module$_jetbrains_ring_ui_components_tabs_tabs.Tabs, Tabs$lambda(active, handler));
  }
  function Tab$lambda(closure$title, closure$id, closure$handler) {
    return function ($receiver) {
      $receiver.attrs.title = closure$title;
      $receiver.attrs.id = closure$id;
      closure$handler($receiver);
      return Unit;
    };
  }
  function Tab($receiver, title, id, handler) {
    if (id === void 0)
      id = title;
    $receiver.invoke_qk0v40$($module$_jetbrains_ring_ui_components_tabs_tabs.Tab, Tab$lambda(title, id, handler));
  }
  function SmartTabs$lambda(closure$active, closure$handler) {
    return function ($receiver) {
      if (closure$active != null) {
        $receiver.attrs.initSelected = closure$active;
      }
      closure$handler($receiver);
      return Unit;
    };
  }
  function SmartTabs($receiver, active, handler) {
    $receiver.invoke_qk0v40$($module$_jetbrains_ring_ui_components_tabs_tabs.SmartTabs, SmartTabs$lambda(active, handler));
  }
  var package$ringui = _.ringui || (_.ringui = {});
  package$ringui.get_error_j0e1ob$ = get_error;
  package$ringui.get_message_j0e1ob$ = get_message;
  package$ringui.get_success_j0e1ob$ = get_success;
  package$ringui.get_warning_j0e1ob$ = get_warning;
  package$ringui.get_loading_j0e1ob$ = get_loading;
  $$importsForInline$$['kotlin-js'] = $module$kotlin_js;
  package$ringui.Color_i3nxhr$ = Color;
  package$ringui.Dialog_lo0hxq$ = Dialog;
  package$ringui.Dropdown_g6tovr$ = Dropdown;
  package$ringui.IFooterItem_61zpoe$ = IFooterItem;
  package$ringui.Island_fvqhhf$ = Island;
  package$ringui.get_dataTest_rgxs1w$ = get_dataTest;
  package$ringui.set_dataTest_624c8t$ = set_dataTest;
  package$ringui.get_xs_gel720$ = get_xs;
  package$ringui.get_sm_gel720$ = get_sm;
  package$ringui.get_md_gel720$ = get_md;
  package$ringui.get_lg_gel720$ = get_lg;
  package$ringui.Tabs_38979e$ = Tabs;
  package$ringui.Tab_gwjedi$ = Tab;
  package$ringui.SmartTabs_6wsyzt$ = SmartTabs;
  Kotlin.defineModule('kotlin-ring-ui', _);
  return _;
}));
