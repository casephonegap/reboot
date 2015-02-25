function reboot() { };

/* reboot device */
reboot.prototype.now = function () 
{ console.log('reboot.now aufgerufen');
  cordova.exec(null, null, 'reboot', 'now', []);
};

module.exports = new reboot();
