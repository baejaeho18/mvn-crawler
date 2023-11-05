(function (root, factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports', 'kotlin'], factory);
  else if (typeof exports === 'object')
    factory(module.exports, require('kotlin'));
  else {
    if (typeof kotlin === 'undefined') {
      throw new Error("Error loading module 'kvision-kvision-electron-jsLegacy'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'kvision-kvision-electron-jsLegacy'.");
    }root['kvision-kvision-electron-jsLegacy'] = factory(typeof this['kvision-kvision-electron-jsLegacy'] === 'undefined' ? {} : this['kvision-kvision-electron-jsLegacy'], kotlin);
  }
}(this, function (_, Kotlin) {
  'use strict';
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var defineInlineFunction = Kotlin.defineInlineFunction;
  var kVManagerElectronInit;
  function KVManagerElectron() {
    KVManagerElectron_instance = this;
    require('electron');
  }
  KVManagerElectron.prototype.init_8be2vx$ = function () {
  };
  KVManagerElectron.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'KVManagerElectron',
    interfaces: []
  };
  var KVManagerElectron_instance = null;
  function KVManagerElectron_getInstance() {
    if (KVManagerElectron_instance === null) {
      new KVManagerElectron();
    }return KVManagerElectron_instance;
  }
  var get_0 = defineInlineFunction('kvision-kvision-electron-jsLegacy.io.kvision.electron.nodejs.get_cbudfr$', function ($receiver, key) {
    return $receiver[key];
  });
  var set = defineInlineFunction('kvision-kvision-electron-jsLegacy.io.kvision.electron.nodejs.set_r5kzy2$', function ($receiver, key, value) {
    $receiver[key] = value;
  });
  var invoke = defineInlineFunction('kvision-kvision-electron-jsLegacy.io.kvision.electron.nodejs.invoke_xlzxkt$', function ($receiver, time) {
    return $receiver(time);
  });
  var package$io = _.io || (_.io = {});
  var package$kvision = package$io.kvision || (package$io.kvision = {});
  Object.defineProperty(package$kvision, 'kVManagerElectronInit_8be2vx$', {
    get: function () {
      return kVManagerElectronInit;
    }
  });
  Object.defineProperty(package$kvision, 'KVManagerElectron', {
    get: KVManagerElectron_getInstance
  });
  var package$electron = package$kvision.electron || (package$kvision.electron = {});
  var package$nodejs = package$electron.nodejs || (package$electron.nodejs = {});
  package$nodejs.get_cbudfr$ = get_0;
  package$nodejs.set_r5kzy2$ = set;
  package$nodejs.invoke_xlzxkt$ = invoke;
  kVManagerElectronInit = KVManagerElectron_getInstance().init_8be2vx$();
  Kotlin.defineModule('kvision-kvision-electron-jsLegacy', _);
  return _;
}));

//# sourceMappingURL=kvision-kvision-electron-jsLegacy.js.map
