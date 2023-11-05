(function (root, factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports', 'kotlin', 'kotlin-js'], factory);
  else if (typeof exports === 'object')
    factory(module.exports, require('kotlin'), require('kotlin-js'));
  else {
    if (typeof kotlin === 'undefined') {
      throw new Error("Error loading module 'kotlin-mui'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'kotlin-mui'.");
    }
    if (typeof this['kotlin-js'] === 'undefined') {
      throw new Error("Error loading module 'kotlin-mui'. Its dependency 'kotlin-js' was not found. Please, check whether 'kotlin-js' is loaded prior to 'kotlin-mui'.");
    }
    root['kotlin-mui'] = factory(typeof this['kotlin-mui'] === 'undefined' ? {} : this['kotlin-mui'], kotlin, this['kotlin-js']);
  }
}(this, function (_, Kotlin, $module$kotlin_js) {
  'use strict';
  var $$importsForInline$$ = _.$$importsForInline$$ || (_.$$importsForInline$$ = {});
  var defineInlineFunction = Kotlin.defineInlineFunction;
  var Unit = Kotlin.kotlin.Unit;
  var Record = $module$kotlin_js.kotlinx.js.Record_a411ad$;
  var Kind_INTERFACE = Kotlin.Kind.INTERFACE;
  var responsive = defineInlineFunction('kotlin-mui.mui.system.responsive_issdgt$', function (value) {
    return value;
  });
  function responsive$lambda(closure$values) {
    return function ($receiver) {
      var tmp$, tmp$_0;
      tmp$ = closure$values;
      for (tmp$_0 = 0; tmp$_0 !== tmp$.length; ++tmp$_0) {
        var tmp$_1 = tmp$[tmp$_0];
        var key = tmp$_1.component1()
        , value = tmp$_1.component2();
        $receiver[key] = value;
      }
      return Unit;
    };
  }
  function responsive_0(values) {
    return Record(responsive$lambda(values));
  }
  var SpacingOptions = defineInlineFunction('kotlin-mui.mui.system.SpacingOptions_za3lpa$', function (value) {
    return value;
  });
  var SpacingOptions_0 = defineInlineFunction('kotlin-mui.mui.system.SpacingOptions_vbafqp$', function (value) {
    return value;
  });
  var SpacingOptions_1 = defineInlineFunction('kotlin-mui.mui.system.SpacingOptions_vd034n$', function (value) {
    return value;
  });
  var SpacingOptions_2 = defineInlineFunction('kotlin-mui.mui.system.SpacingOptions_q971yk$', function (value) {
    return value;
  });
  var SpacingOptions_3 = defineInlineFunction('kotlin-mui.mui.system.SpacingOptions_tz93gh$', function (value) {
    return value;
  });
  function Spacing() {
  }
  Spacing.prototype.invoke = defineInlineFunction('kotlin-mui.mui.system.Spacing.invoke', function () {
    return this();
  });
  Spacing.prototype.invoke_za3lpa$ = defineInlineFunction('kotlin-mui.mui.system.Spacing.invoke_za3lpa$', function (value) {
    return this(value);
  });
  Spacing.prototype.invoke_vux9f0$ = defineInlineFunction('kotlin-mui.mui.system.Spacing.invoke_vux9f0$', function (topBottom, rightLeft) {
    return this(topBottom, rightLeft);
  });
  Spacing.prototype.invoke_qt1dr2$ = defineInlineFunction('kotlin-mui.mui.system.Spacing.invoke_qt1dr2$', function (top, rightLeft, bottom) {
    return this(top, rightLeft, bottom);
  });
  Spacing.prototype.invoke_tjonv8$ = defineInlineFunction('kotlin-mui.mui.system.Spacing.invoke_tjonv8$', function (top, right, bottom, left) {
    return this(top, right, bottom, left);
  });
  Spacing.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Spacing',
    interfaces: []
  };
  var sx = defineInlineFunction('kotlin-mui.mui.system.sx_n3nt7k$', function ($receiver, block) {
    var $receiver_0 = {};
    block($receiver_0);
    $receiver.sx = $receiver_0;
  });
  var create = defineInlineFunction('kotlin-mui.mui.material.styles.create_imuglc$', function ($receiver, props, block) {
    var tmp$ = $receiver.create;
    var $receiver_0 = {};
    block($receiver_0);
    return tmp$.call($receiver, props, $receiver_0);
  });
  var package$mui = _.mui || (_.mui = {});
  var package$system = package$mui.system || (package$mui.system = {});
  package$system.responsive_issdgt$ = responsive;
  $$importsForInline$$['kotlin-js'] = $module$kotlin_js;
  package$system.responsive_ae116r$ = responsive_0;
  package$system.SpacingOptions_za3lpa$ = SpacingOptions;
  package$system.SpacingOptions_vbafqp$ = SpacingOptions_0;
  package$system.SpacingOptions_vd034n$ = SpacingOptions_1;
  package$system.SpacingOptions_q971yk$ = SpacingOptions_2;
  package$system.SpacingOptions_tz93gh$ = SpacingOptions_3;
  package$system.Spacing = Spacing;
  package$system.sx_n3nt7k$ = sx;
  var package$material = package$mui.material || (package$mui.material = {});
  var package$styles = package$material.styles || (package$material.styles = {});
  package$styles.create_imuglc$ = create;
  Kotlin.defineModule('kotlin-mui', _);
  return _;
}));
