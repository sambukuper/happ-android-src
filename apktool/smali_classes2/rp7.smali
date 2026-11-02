.class public abstract Lrp7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static final a(Lcm5;Lgn2;Lkx4;Llp2;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v14, p3

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v0, 0x2d95c482

    .line 11
    .line 12
    .line 13
    invoke-virtual {v14, v0}, Llp2;->X(I)Llp2;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v14, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x2

    .line 25
    :goto_0
    or-int v0, p4, v0

    .line 26
    .line 27
    invoke-virtual {v14, v2}, Llp2;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/16 v4, 0x20

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    move v3, v4

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/16 v3, 0x10

    .line 38
    .line 39
    :goto_1
    or-int/2addr v0, v3

    .line 40
    and-int/lit16 v3, v0, 0x93

    .line 41
    .line 42
    const/16 v5, 0x92

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x1

    .line 46
    if-eq v3, v5, :cond_2

    .line 47
    .line 48
    move v3, v7

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v3, v6

    .line 51
    :goto_2
    and-int/lit8 v5, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {v14, v5, v3}, Llp2;->N(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_6

    .line 58
    .line 59
    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 60
    .line 61
    move-object v5, v1

    .line 62
    check-cast v5, Lb2;

    .line 63
    .line 64
    invoke-virtual {v5}, Lb2;->e()Ljava/util/Collection;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Lx73;

    .line 69
    .line 70
    invoke-static/range {p2 .. p2}, Lg33;->e(Lkx4;)Lkx4;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    const/high16 v9, 0x41c00000    # 24.0f

    .line 75
    .line 76
    const/4 v10, 0x7

    .line 77
    invoke-static {v10, v9}, Los4;->e(IF)Lig5;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-virtual {v14, v5}, Llp2;->f(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    and-int/lit8 v0, v0, 0x70

    .line 86
    .line 87
    if-ne v0, v4, :cond_3

    .line 88
    .line 89
    move v6, v7

    .line 90
    :cond_3
    or-int v0, v10, v6

    .line 91
    .line 92
    invoke-virtual {v14}, Llp2;->K()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    sget-object v0, Lzz0;->a:Lbe;

    .line 99
    .line 100
    if-ne v4, v0, :cond_5

    .line 101
    .line 102
    :cond_4
    new-instance v4, Lsn;

    .line 103
    .line 104
    const/16 v0, 0x1c

    .line 105
    .line 106
    invoke-direct {v4, v5, v2, v3, v0}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v14, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    move-object v13, v4

    .line 113
    check-cast v13, Lgn2;

    .line 114
    .line 115
    const/16 v15, 0xc00

    .line 116
    .line 117
    const/16 v16, 0x7f6

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    const/4 v5, 0x0

    .line 121
    const/4 v7, 0x0

    .line 122
    move-object v3, v8

    .line 123
    const/4 v8, 0x0

    .line 124
    move-object v6, v9

    .line 125
    const/4 v9, 0x0

    .line 126
    const/4 v10, 0x0

    .line 127
    const/4 v11, 0x0

    .line 128
    const/4 v12, 0x0

    .line 129
    invoke-static/range {v3 .. v16}, Ljb5;->a(Lkx4;Lj74;FLgg5;Lgt;Lp8;Lhe2;ZLtd;ZLgn2;Llp2;II)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    invoke-virtual/range {p3 .. p3}, Llp2;->Q()V

    .line 134
    .line 135
    .line 136
    :goto_3
    invoke-virtual/range {p3 .. p3}, Llp2;->r()Lj86;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    if-eqz v6, :cond_7

    .line 141
    .line 142
    new-instance v0, Lfh;

    .line 143
    .line 144
    const/16 v5, 0x14

    .line 145
    .line 146
    move-object/from16 v3, p2

    .line 147
    .line 148
    move/from16 v4, p4

    .line 149
    .line 150
    invoke-direct/range {v0 .. v5}, Lfh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkx4;IB)V

    .line 151
    .line 152
    .line 153
    iput-object v0, v6, Lj86;->d:Lrn2;

    .line 154
    .line 155
    :cond_7
    return-void
.end method

.method public static final b(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/animation/LayoutTransition;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/animation/LayoutTransition;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    const-wide/16 v2, 0x1f4

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2, v3}, Landroid/animation/LayoutTransition;->setStagger(IJ)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;
    .locals 12

    .line 1
    const/4 v0, 0x4

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move p2, v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/net/Uri;->isOpaque()Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez p3, :cond_8

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    if-nez v6, :cond_1

    .line 22
    .line 23
    goto :goto_4

    .line 24
    :cond_1
    invoke-static {p1, v2}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    const/4 p1, 0x0

    .line 33
    move v3, p1

    .line 34
    :goto_0
    const/16 p3, 0x26

    .line 35
    .line 36
    invoke-static {v6, p3, v3, v0}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    const/4 v9, -0x1

    .line 41
    if-eq p3, v9, :cond_2

    .line 42
    .line 43
    move v10, p3

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move v10, p0

    .line 46
    :goto_1
    const/16 v4, 0x3d

    .line 47
    .line 48
    invoke-static {v6, v4, v3, v0}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-gt v4, v10, :cond_4

    .line 53
    .line 54
    if-ne v4, v9, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move v11, v4

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    :goto_2
    move v11, v10

    .line 60
    :goto_3
    sub-int v4, v11, v3

    .line 61
    .line 62
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-ne v4, v5, :cond_6

    .line 67
    .line 68
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v4, 0x0

    .line 74
    invoke-static/range {v3 .. v8}, Lmm7;->U(IIILjava/lang/String;Ljava/lang/String;Z)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_6

    .line 79
    .line 80
    if-ne v11, v10, :cond_5

    .line 81
    .line 82
    const-string p0, ""

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_5
    add-int/2addr v11, v1

    .line 86
    invoke-virtual {v6, v11, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p2, p0, p1}, Leq8;->a(ILjava/lang/String;Z)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_6
    if-eq p3, v9, :cond_7

    .line 96
    .line 97
    add-int/lit8 v3, p3, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_7
    :goto_4
    return-object v2

    .line 101
    :cond_8
    const-string p0, "This isn\'t a hierarchical URI."

    .line 102
    .line 103
    invoke-static {p0}, Lu52;->k(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v2
.end method

.method public static d(Landroid/net/Uri;Ljava/lang/String;)Ljava/util/List;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->isOpaque()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_7

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    if-nez v5, :cond_0

    .line 13
    .line 14
    sget-object p0, Ld02;->X:Ld02;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-static {p1, v1}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    new-instance p0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    move v2, p1

    .line 28
    :goto_0
    const/16 v0, 0x26

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    invoke-static {v5, v0, v2, v1}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v8, -0x1

    .line 36
    if-eq v0, v8, :cond_1

    .line 37
    .line 38
    move v9, v0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    move v9, v3

    .line 45
    :goto_1
    const/16 v3, 0x3d

    .line 46
    .line 47
    invoke-static {v5, v3, v2, v1}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-gt v1, v9, :cond_2

    .line 52
    .line 53
    if-ne v1, v8, :cond_3

    .line 54
    .line 55
    :cond_2
    move v1, v9

    .line 56
    :cond_3
    sub-int v3, v1, v2

    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-ne v3, v4, :cond_5

    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-static/range {v2 .. v7}, Lmm7;->U(IIILjava/lang/String;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_5

    .line 75
    .line 76
    if-ne v1, v9, :cond_4

    .line 77
    .line 78
    const-string v1, ""

    .line 79
    .line 80
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 85
    .line 86
    invoke-virtual {v5, v1, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const/4 v2, 0x1

    .line 91
    invoke-static {v2, v1, p1}, Leq8;->a(ILjava/lang/String;Z)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_5
    :goto_2
    if-eq v0, v8, :cond_6

    .line 99
    .line 100
    add-int/lit8 v2, v0, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    return-object p0

    .line 104
    :cond_7
    const-string p0, "This isn\'t a hierarchical URI."

    .line 105
    .line 106
    invoke-static {p0}, Lu52;->k(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v1
.end method

.method public static final e(Landroid/view/View;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v2

    .line 15
    :goto_0
    if-ne v0, p1, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    if-ne p1, v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget v0, Lj26;->fade_in:I

    .line 25
    .line 26
    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    if-nez p1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget v0, Lj26;->fade_out:I

    .line 44
    .line 45
    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 50
    .line 51
    .line 52
    const/16 p1, 0x8

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static final f(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Character;->isISOControl(I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static g(ILandroid/view/View;ZZ)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p0, v0

    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    move p3, v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    move p0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move p0, v2

    .line 20
    :goto_0
    if-ne p0, p2, :cond_2

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    if-nez p3, :cond_4

    .line 24
    .line 25
    if-eqz p2, :cond_3

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_3
    const/16 v2, 0x8

    .line 29
    .line 30
    :goto_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_4
    const-wide/16 v3, 0x1f4

    .line 35
    .line 36
    if-ne p2, v1, :cond_5

    .line 37
    .line 38
    invoke-virtual {p1, v2, v2}, Landroid/view/View;->measure(II)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    filled-new-array {v1, p0}, [I

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    .line 56
    new-instance p2, Lnw8;

    .line 57
    .line 58
    invoke-direct {p2, p1, v2}, Lnw8;-><init>(Landroid/view/View;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 62
    .line 63
    .line 64
    new-instance p2, Low8;

    .line 65
    .line 66
    invoke-direct {p2, p1, v1}, Low8;-><init>(Landroid/view/KeyEvent$Callback;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 70
    .line 71
    .line 72
    new-instance p2, Low8;

    .line 73
    .line 74
    invoke-direct {p2, p1, v2}, Low8;-><init>(Landroid/view/KeyEvent$Callback;B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    if-nez p2, :cond_6

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    filled-new-array {p0, v1}, [I

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 99
    .line 100
    .line 101
    new-instance p2, Lnw8;

    .line 102
    .line 103
    invoke-direct {p2, p1, v1}, Lnw8;-><init>(Landroid/view/View;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 107
    .line 108
    .line 109
    new-instance p2, Low8;

    .line 110
    .line 111
    invoke-direct {p2, p1, v0}, Low8;-><init>(Landroid/view/KeyEvent$Callback;B)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_6
    invoke-static {}, Lb61;->c()V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public static final h(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Landroid/net/Uri;->getPort()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, -0x1

    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->getPort()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string p1, ":"

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    return-object p0
.end method
