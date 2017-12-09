function  test() {
    var str = '';
    str = '<li>\n' +
        '<div class="project_name">\n' +
        '<a objId="${bulletin.objId}" >${bulletin.bullTitle}</a>' +
        '' +
        '</div>\n' +
        '<div class="project_other">\n' +
        '' +
        ' <div class="time">\n' +
        ' <span>\n' +
        '<p><fmt:formatDate value="${bulletin.relDate}" pattern="MM-dd"/></p>\n' +
        '<p><b><fmt:formatDate value="${bulletin.relDate}" pattern="yyyy"/></b></p>\n' +
        '</span>\n' +
        '</div>\n' +
        '</div>\n' +
        '</li>';

}