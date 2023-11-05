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
/*global NX, Ext, Nexus, Sonatype*/

/**
 * Logger level combo.
 *
 * @since 2.7
 */
NX.define('Nexus.logging.view.LoggerLevel', {
  extend: 'Ext.form.ComboBox',
  xtype: 'nx-logging-combo-logger-level',

  /**
   * @override
   */
  initComponent: function () {
    var me = this;

    Ext.apply(me, {
      triggerAction: 'all',
      lazyRender: true,
      mode: 'local',
      emptyText: 'Select...',
      editable: false,

      store: NX.create('Ext.data.ArrayStore', {
        id: 0,
        fields: [
          'level',
          'text'
        ],
        data: [
          ['TRACE', 'TRACE'],
          ['DEBUG', 'DEBUG'],
          ['INFO', 'INFO'],
          ['WARN', 'WARN'],
          ['ERROR', 'ERROR'],
          ['OFF', 'OFF'],
          ['DEFAULT', 'DEFAULT']
        ]
      }),
      valueField: 'level',
      displayField: 'text'
    });

    me.constructor.superclass.initComponent.apply(me, arguments);
  }

});