/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2013 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
/*global NX, Ext, Nexus*/

/**
 * Loggers store.
 *
 * @since 2.7
 */
NX.define('Nexus.logging.store.Logger', {
  extend: 'Ext.data.Store',

  mixins: [
    'Nexus.LogAwareMixin'
  ],

  requires: [
    'Nexus.siesta'
  ],

  /**
   * @constructor
   */
  constructor: function () {
    var me = this;

    Ext.apply(me, {
      storeId: 'nx-logging-store-logger',
      autoDestroy: true,
      restful: true,

      sortInfo: { field: 'name', direction: 'ASC' },

      proxy: NX.create('Ext.data.HttpProxy', {
        url: Nexus.siesta.basePath + '/logging/loggers'
      }),

      reader: NX.create('Ext.data.JsonReader', {
        root: '',
        idProperty: 'name',
        fields: [
          'name',
          'level'
        ]
      }),

      writer: NX.create('Ext.data.JsonWriter', {
        encode: false,
        render: function (params, baseParams, data) {
          params.jsonData = data;
        }
      })
    });

    me.constructor.superclass.constructor.call(me);

    Ext.apply(me.reader, {
      // HACK: without this create will fail as it will look for a successProperty in response
      getSuccess: function (obj) {
        return Ext.isDefined(obj);
      }
    });
  }

});