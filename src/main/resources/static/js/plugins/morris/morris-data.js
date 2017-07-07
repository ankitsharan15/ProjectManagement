// Morris.js Charts sample data for SB Admin template

$(function() {

    // Area Chart
    Morris.Area({
        element: 'morris-area-chart',
        data: [{
            period: '2015 Q1',
            talenthum: 2666,
            engati: null,
            peoplehum: 2647
        }, {
            period: '2015 Q2',
            talenthum: 2778,
            engati: 2294,
            peoplehum: 2441
        }, {
            period: '2015 Q3',
            talenthum: 4912,
            engati: 1969,
            peoplehum: 2501
        }, {
            period: '2015 Q4',
            talenthum: 3767,
            engati: 3597,
            peoplehum: 5689
        }, {
            period: '2016 Q1',
            talenthum: 6810,
            engati: 1914,
            peoplehum: 2293
        }, {
            period: '2016 Q2',
            talenthum: 5670,
            engati: 4293,
            peoplehum: 1881
        }, {
            period: '2016 Q3',
            talenthum: 4820,
            engati: 3795,
            peoplehum: 1588
        }, {
            period: '2016 Q4',
            talenthum: 15073,
            engati: 5967,
            peoplehum: 5175
        }, {
            period: '2017 Q1',
            talenthum: 10687,
            engati: 4460,
            peoplehum: 2028
        }, {
            period: '2017 Q2',
            talenthum: 8432,
            engati: 5713,
            peoplehum: 1791
        }],
        xkey: 'period',
        ykeys: ['talenthum', 'engati', 'peoplehum'],
        labels: ['talenthum', 'engati', 'peoplehum'],
        pointSize: 2,
        hideHover: 'auto',
        resize: true
    });

    // Donut Chart
    Morris.Donut({
        element: 'morris-donut-chart',
        data: [{
            label: "talentHum",
            value: 50
        }, {
            label: "peopleHum",
            value: 25
        }, {
            label: "engati",
            value: 25
        }],
        resize: true
    });




});
