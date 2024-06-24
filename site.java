document.addEventListener("DOMContentLoaded", function() {
    var contents = document.querySelectorAll('.content');

    contents.forEach(function(content) {
        content.addEventListener('mouseenter', function() {
            var p = content.querySelector('p');
            p.style.display = 'block';
            setTimeout(function() {
                p.style.opacity = '1';
            }, 50);
            content.style.maxHeight = content.scrollHeight + 'px';
        });

        content.addEventListener('mouseleave', function() {
            var p = content.querySelector('p');
            p.style.opacity = '0';
            content.style.maxHeight = '50px';

            setTimeout(function() {
                p.style.display = 'none';
            }, 1500);  
        });
    });

    var exampleItems = document.querySelectorAll('.example-item');
    exampleItems.forEach(function(exampleItem) {
        exampleItem.addEventListener('mouseenter', function() {
            var p = exampleItem.querySelector('p');
            p.style.display = 'block';
            setTimeout(function() {
                p.style.opacity = '1';
            }, 50); 
        });

        exampleItem.addEventListener('mouseleave', function() {
            var p = exampleItem.querySelector('p');
            p.style.opacity = '0';

            setTimeout(function() {
                p.style.display = 'none';
            }, 1500); 
        });
    });
});