var CryptoJS = require('crypto-js')



function decrypt (text, originKey) {
    var originKey = originKey.slice(0, 16),
        key = CryptoJS.enc.Utf8.parse(originKey),
        iv = CryptoJS.enc.Utf8.parse(originKey)
    var bytes = CryptoJS.AES.decrypt(text, key, {
        iv: iv
    })
    var plaintext = CryptoJS.enc.Utf8.stringify(bytes)
    return plaintext
}


console.log(decrypt('ITSF79rtuwQzLg31MpK06tmFa7z9+xBcbgdtVlogy6wayHbdgAyI5jHmUydMoXWA8vGXAjeEIQcUblCdNE4aWsnwG+dYmrG/8oMzb4uFpLMO5Jo5p6saySV4nSZn3jnCodAlCmo2sjfQ1YDsJyoCSvv8jQj4tW0XpgD01gW38hslg6FFtI1A0fiTNlJeSC/px8uZK72wK/TkhOikcbm3fX+2TBJtR9oAGQpEQ8X7jOPvsIT8puvpFHyBpIobc9sVy2A//evygD6f3l5pVMJHSCEyyB5BHFXjSGWza2PdGBvB7rMIl8Lt3evgum1fyif6lh71P7MCWay+tgXTHfWui+5ihLRkZOMpMgrYabQEPwnadOfi4WezXX761hpBvtkb90OHzR1dvbsCsIJbf9gz40G4vmvzu9MQFAnbLiyaqQa+OacU2X/f5fca+Tl88rJ0yabemUQRNfx79FCMiITL6n0FqePTDBR09pxIHl4yu0V0gG+1jTEoC7P0v5kT7xOv+He07NQuuCS3TV0q66OVZx5OQk5+AlOCk3Fq0VqC+JEg2T36feogzREIW4h4QoWoBsTeUI92s6gF2LP+h6/FXRXesEzS6gqzxEmhGVafogAoGvQKCcJzyiMkfKkUvm545B5sfwvaxrJH/8L+HfWFx3+0wL7k/od8wCSdX4IYyUo=','4heU02x70Y3n9F6Gb0cDj7vD9y2STFpDvFwKCEBftR1RKgR5F2gBTq/1tNrJxaun38TBxAmuWMDVeqx3lyzC4G7d9gs+5UmlZhwRlZj0W7CZT8N6OOrtjcmhaHPHrEbh11tZ/ipHJtWLNn7flH+brw=='))
