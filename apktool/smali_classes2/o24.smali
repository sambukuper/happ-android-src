.class public final Lo24;
.super Landroidx/recyclerview/widget/f;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final c:Ljava/lang/String;

.field public final d:Landroid/graphics/drawable/Drawable;

.field public final e:Landroid/graphics/drawable/Drawable;

.field public final f:Ld0;

.field public final g:Liv;

.field public h:Ldn2;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ld0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/f;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo24;->c:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lo24;->d:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    iput-object p3, p0, Lo24;->e:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    iput-object p4, p0, Lo24;->f:Ld0;

    .line 11
    .line 12
    new-instance p1, Lh52;

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    invoke-direct {p1, p2}, Lh52;-><init>(B)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Liv;

    .line 19
    .line 20
    invoke-direct {p2, p0, p1}, Liv;-><init>(Landroidx/recyclerview/widget/f;Lnr4;)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lo24;->g:Liv;

    .line 24
    .line 25
    new-instance p1, Lei3;

    .line 26
    .line 27
    const/16 p2, 0x9

    .line 28
    .line 29
    invoke-direct {p1, p2}, Lei3;-><init>(B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lo24;->h:Ldn2;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lo24;->g:Liv;

    .line 2
    .line 3
    iget-object p0, p0, Liv;->f:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final e(Landroidx/recyclerview/widget/l;I)V
    .locals 5

    .line 1
    check-cast p1, Ln24;

    .line 2
    .line 3
    iget-object v0, p0, Lo24;->g:Liv;

    .line 4
    .line 5
    iget-object v0, v0, Liv;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lsu/happ/proxyutility/dto/LanguageData;

    .line 12
    .line 13
    iget-object v1, p1, Ln24;->v:Lq02;

    .line 14
    .line 15
    invoke-static {v1}, Lmb6;->g(Lg91;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, Ln24;->u:Lqi3;

    .line 19
    .line 20
    iget-object v1, p1, Lqi3;->h0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 21
    .line 22
    iget-object v2, p1, Lqi3;->Z:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 23
    .line 24
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/LanguageData;->a()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/LanguageData;->b()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v3, p1, Lqi3;->g0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Lo24;->d:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Ll24;

    .line 46
    .line 47
    invoke-direct {v1, p1, p0, v4}, Ll24;-><init>(Lqi3;Lo24;B)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lo24;->h:Ldn2;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v1, p0, Lo24;->e:Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    new-instance v1, Lm24;

    .line 59
    .line 60
    invoke-direct {v1, p0, p1, v0, v4}, Lm24;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lo24;->c:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/LanguageData;->c()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    if-nez p2, :cond_2

    .line 83
    .line 84
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 85
    .line 86
    .line 87
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lo24;->a()I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    add-int/lit8 p0, p0, -0x1

    .line 92
    .line 93
    if-ne p2, p0, :cond_3

    .line 94
    .line 95
    iget-object p0, p1, Lqi3;->f0:Landroid/view/View;

    .line 96
    .line 97
    const/4 p1, 0x4

    .line 98
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    :cond_3
    return-void
.end method

.method public final f(Landroidx/recyclerview/widget/l;ILjava/util/List;)V
    .locals 1

    .line 1
    check-cast p1, Ln24;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-static {p3}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    check-cast p1, Landroid/os/Bundle;

    .line 20
    .line 21
    const-string p2, "update"

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object p0, p0, Lo24;->g:Liv;

    .line 30
    .line 31
    iget-object p1, p0, Liv;->f:Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, Liv;->b(Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :cond_1
    invoke-virtual {p0, p1, p2}, Lo24;->e(Landroidx/recyclerview/widget/l;I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final g(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/l;
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    sget v0, Lt46;->item_recycler_language:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    move-object v1, p1

    .line 17
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 18
    .line 19
    sget p2, Le46;->divider:I

    .line 20
    .line 21
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    sget p2, Le46;->language_activated:I

    .line 28
    .line 29
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v4, v0

    .line 34
    check-cast v4, Landroidx/appcompat/widget/AppCompatImageView;

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    sget p2, Le46;->language_name:I

    .line 39
    .line 40
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move-object v5, v0

    .line 45
    check-cast v5, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 46
    .line 47
    if-eqz v5, :cond_0

    .line 48
    .line 49
    new-instance v0, Lqi3;

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    move-object v2, v1

    .line 53
    invoke-direct/range {v0 .. v6}, Lqi3;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Lsu/happ/proxyutility/ui/foundation/component/HappTextView;B)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Ln24;

    .line 57
    .line 58
    invoke-direct {p1, p0, v0}, Ln24;-><init>(Lo24;Lqi3;)V

    .line 59
    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-string p1, "Missing required view with ID: "

    .line 71
    .line 72
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, Lb61;->i(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 p0, 0x0

    .line 80
    return-object p0
.end method
