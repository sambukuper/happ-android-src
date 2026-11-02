.class public abstract Lbs7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static a:Lz47;


# direct methods
.method public static final a(Lfu7;Lgn2;Lkx4;Llp2;I)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v3, -0x14d58230

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, v3}, Llp2;->X(I)Llp2;

    .line 8
    .line 9
    .line 10
    and-int/lit8 v3, p4, 0x6

    .line 11
    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    invoke-virtual {p3, p0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v3, 0x2

    .line 23
    :goto_0
    or-int/2addr v3, p4

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v3, p4

    .line 26
    :goto_1
    and-int/lit8 v4, p4, 0x30

    .line 27
    .line 28
    if-nez v4, :cond_3

    .line 29
    .line 30
    invoke-virtual {p3, p1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    const/16 v4, 0x20

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v4, 0x10

    .line 40
    .line 41
    :goto_2
    or-int/2addr v3, v4

    .line 42
    :cond_3
    and-int/lit16 v4, p4, 0x180

    .line 43
    .line 44
    if-nez v4, :cond_5

    .line 45
    .line 46
    invoke-virtual {p3, p2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    const/16 v5, 0x100

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_4
    const/16 v5, 0x80

    .line 56
    .line 57
    :goto_3
    or-int/2addr v3, v5

    .line 58
    :cond_5
    and-int/lit16 v5, v3, 0x93

    .line 59
    .line 60
    const/16 v7, 0x92

    .line 61
    .line 62
    if-eq v5, v7, :cond_6

    .line 63
    .line 64
    const/4 v5, 0x1

    .line 65
    goto :goto_4

    .line 66
    :cond_6
    const/4 v5, 0x0

    .line 67
    :goto_4
    and-int/lit8 v7, v3, 0x1

    .line 68
    .line 69
    invoke-virtual {p3, v7, v5}, Llp2;->N(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_7

    .line 74
    .line 75
    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 76
    .line 77
    sget v7, Ly46;->title_sub_setting:I

    .line 78
    .line 79
    invoke-static {v7, p3}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    new-instance v8, Lp90;

    .line 84
    .line 85
    const/16 v9, 0xb

    .line 86
    .line 87
    invoke-direct {v8, p0, p1, v5, v9}, Lp90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    const v5, 0x48ebff5c    # 483322.88f

    .line 91
    .line 92
    .line 93
    invoke-static {v5, v8, p3}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    shr-int/lit8 v3, v3, 0x6

    .line 98
    .line 99
    and-int/lit8 v3, v3, 0xe

    .line 100
    .line 101
    or-int/lit16 v3, v3, 0x180

    .line 102
    .line 103
    const/4 v8, 0x0

    .line 104
    move-object v6, p3

    .line 105
    move-object v4, v7

    .line 106
    move v7, v3

    .line 107
    move-object v3, p2

    .line 108
    invoke-static/range {v3 .. v8}, Lci8;->a(Lkx4;Ljava/lang/String;Lzy0;Llp2;II)V

    .line 109
    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_7
    invoke-virtual {p3}, Llp2;->Q()V

    .line 113
    .line 114
    .line 115
    :goto_5
    invoke-virtual {p3}, Llp2;->r()Lj86;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    if-eqz v6, :cond_8

    .line 120
    .line 121
    new-instance v0, Las7;

    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    move-object v1, p0

    .line 125
    move-object v2, p1

    .line 126
    move-object v3, p2

    .line 127
    move v4, p4

    .line 128
    invoke-direct/range {v0 .. v5}, Las7;-><init>(Lfu7;Lgn2;Lkx4;IB)V

    .line 129
    .line 130
    .line 131
    iput-object v0, v6, Lj86;->d:Lrn2;

    .line 132
    .line 133
    :cond_8
    return-void
.end method

.method public static final b(Lkd8;Lr68;Ly78;J)J
    .locals 16

    .line 1
    move-wide/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lr68;->n()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    const-wide v4, 0x7fffffff7fffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v4, v2

    .line 13
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v4, v4, v6

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    goto/16 :goto_6

    .line 23
    .line 24
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lkd8;->d()Lh48;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-object v4, v4, Lh48;->Z:Ljava/lang/CharSequence;

    .line 29
    .line 30
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lkd8;->d()Lh48;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    iget-wide v4, v4, Lh48;->f0:J

    .line 43
    .line 44
    invoke-virtual/range {p1 .. p1}, Lr68;->l()Lev2;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    const/4 v9, -0x1

    .line 49
    if-nez v8, :cond_2

    .line 50
    .line 51
    move v8, v9

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    sget-object v10, Lx58;->a:[I

    .line 54
    .line 55
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    aget v8, v10, v8

    .line 60
    .line 61
    :goto_0
    if-eq v8, v9, :cond_d

    .line 62
    .line 63
    const/4 v9, 0x1

    .line 64
    const-wide/16 v10, 0x0

    .line 65
    .line 66
    const-wide v12, 0xffffffffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    const/4 v14, 0x2

    .line 72
    const/16 v15, 0x20

    .line 73
    .line 74
    if-eq v8, v9, :cond_4

    .line 75
    .line 76
    if-eq v8, v14, :cond_4

    .line 77
    .line 78
    const/4 v9, 0x3

    .line 79
    if-ne v8, v9, :cond_3

    .line 80
    .line 81
    sget v8, Lf88;->c:I

    .line 82
    .line 83
    and-long/2addr v4, v12

    .line 84
    :goto_1
    long-to-int v4, v4

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 87
    .line 88
    .line 89
    return-wide v10

    .line 90
    :cond_4
    sget v8, Lf88;->c:I

    .line 91
    .line 92
    shr-long/2addr v4, v15

    .line 93
    goto :goto_1

    .line 94
    :goto_2
    invoke-virtual/range {p2 .. p2}, Ly78;->c()Lx78;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-nez v5, :cond_5

    .line 99
    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :cond_5
    iget-object v8, v5, Lx78;->b:Lbz4;

    .line 103
    .line 104
    shr-long/2addr v2, v15

    .line 105
    long-to-int v2, v2

    .line 106
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-virtual {v8, v4}, Lbz4;->c(I)I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-virtual {v5, v3}, Lx78;->f(I)F

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-virtual {v5, v3}, Lx78;->g(I)F

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    invoke-static {v2, v9, v4}, Lx97;->m(FFF)F

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    invoke-static {v0, v1, v10, v11}, Lpf3;->a(JJ)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-nez v5, :cond_6

    .line 139
    .line 140
    sub-float/2addr v2, v4

    .line 141
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    shr-long/2addr v0, v15

    .line 146
    long-to-int v0, v0

    .line 147
    div-int/2addr v0, v14

    .line 148
    int-to-float v0, v0

    .line 149
    cmpl-float v0, v2, v0

    .line 150
    .line 151
    if-lez v0, :cond_6

    .line 152
    .line 153
    goto/16 :goto_6

    .line 154
    .line 155
    :cond_6
    invoke-virtual {v8, v3}, Lbz4;->e(I)F

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    invoke-virtual {v8, v3}, Lbz4;->a(I)F

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    sub-float/2addr v1, v0

    .line 164
    const/high16 v2, 0x40000000    # 2.0f

    .line 165
    .line 166
    div-float/2addr v1, v2

    .line 167
    add-float/2addr v1, v0

    .line 168
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    int-to-long v2, v0

    .line 173
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    int-to-long v0, v0

    .line 178
    shl-long/2addr v2, v15

    .line 179
    and-long/2addr v0, v12

    .line 180
    or-long/2addr v0, v2

    .line 181
    invoke-virtual/range {p2 .. p2}, Ly78;->e()Ly24;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    const/4 v3, 0x0

    .line 186
    if-eqz v2, :cond_8

    .line 187
    .line 188
    invoke-interface {v2}, Ly24;->g()Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-eqz v4, :cond_7

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    move-object v2, v3

    .line 196
    :goto_3
    if-eqz v2, :cond_8

    .line 197
    .line 198
    invoke-static {v2}, Lzc1;->o0(Ly24;)Ls86;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-static {v0, v1, v2}, Lys7;->b(JLs86;)J

    .line 203
    .line 204
    .line 205
    move-result-wide v0

    .line 206
    :cond_8
    invoke-virtual/range {p2 .. p2}, Ly78;->e()Ly24;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    if-eqz v2, :cond_c

    .line 211
    .line 212
    invoke-interface {v2}, Ly24;->g()Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_9

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_9
    move-object v2, v3

    .line 220
    :goto_4
    if-eqz v2, :cond_c

    .line 221
    .line 222
    move-object/from16 v4, p2

    .line 223
    .line 224
    iget-object v4, v4, Ly78;->d:Lrh5;

    .line 225
    .line 226
    invoke-virtual {v4}, Lrh5;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Ly24;

    .line 231
    .line 232
    if-eqz v4, :cond_b

    .line 233
    .line 234
    invoke-interface {v4}, Ly24;->g()Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_a

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_a
    move-object v4, v3

    .line 242
    :goto_5
    if-eqz v4, :cond_b

    .line 243
    .line 244
    invoke-interface {v4, v2, v0, v1}, Ly24;->C(Ly24;J)J

    .line 245
    .line 246
    .line 247
    move-result-wide v2

    .line 248
    new-instance v4, Lz85;

    .line 249
    .line 250
    invoke-direct {v4, v2, v3}, Lz85;-><init>(J)V

    .line 251
    .line 252
    .line 253
    move-object v3, v4

    .line 254
    :cond_b
    if-eqz v3, :cond_c

    .line 255
    .line 256
    iget-wide v0, v3, Lz85;->a:J

    .line 257
    .line 258
    :cond_c
    return-wide v0

    .line 259
    :cond_d
    :goto_6
    return-wide v6
.end method

.method public static c(Landroid/view/View;Landroid/transition/TransitionValues;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/leanback/transition/FadeAndShortSlide;)Landroid/animation/ObjectAnimator;
    .locals 4

    .line 1
    move v0, p5

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    .line 3
    .line 4
    .line 5
    move-result p5

    .line 6
    move v1, p6

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 8
    .line 9
    .line 10
    move-result p6

    .line 11
    iget-object v2, p1, Landroid/transition/TransitionValues;->view:Landroid/view/View;

    .line 12
    .line 13
    sget v3, Lu36;->transitionPosition:I

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, [I

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 p4, 0x0

    .line 24
    aget p4, v2, p4

    .line 25
    .line 26
    sub-int/2addr p4, p2

    .line 27
    int-to-float p4, p4

    .line 28
    add-float/2addr p4, p5

    .line 29
    const/4 v0, 0x1

    .line 30
    aget v0, v2, v0

    .line 31
    .line 32
    sub-int/2addr v0, p3

    .line 33
    int-to-float v0, v0

    .line 34
    add-float/2addr v0, p6

    .line 35
    :cond_0
    sub-float v2, p4, p5

    .line 36
    .line 37
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/2addr v2, p2

    .line 42
    sub-float p2, v0, p6

    .line 43
    .line 44
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    add-int/2addr p2, p3

    .line 49
    invoke-virtual {p0, p4}, Landroid/view/View;->setTranslationX(F)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 53
    .line 54
    .line 55
    cmpl-float p3, p4, v1

    .line 56
    .line 57
    if-nez p3, :cond_1

    .line 58
    .line 59
    cmpl-float p3, v0, p7

    .line 60
    .line 61
    if-nez p3, :cond_1

    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0

    .line 65
    :cond_1
    new-instance p3, Landroid/graphics/Path;

    .line 66
    .line 67
    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, p4, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3, v1, p7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 74
    .line 75
    .line 76
    sget-object p4, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 77
    .line 78
    sget-object p7, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 79
    .line 80
    invoke-static {p0, p4, p7, p3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 81
    .line 82
    .line 83
    move-result-object p7

    .line 84
    move-object p3, p1

    .line 85
    move-object p1, p0

    .line 86
    new-instance p0, Loe8;

    .line 87
    .line 88
    iget-object p3, p3, Landroid/transition/TransitionValues;->view:Landroid/view/View;

    .line 89
    .line 90
    move p4, p2

    .line 91
    move-object p2, p3

    .line 92
    move p3, v2

    .line 93
    invoke-direct/range {p0 .. p6}, Loe8;-><init>(Landroid/view/View;Landroid/view/View;IIFF)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p9, p0}, Landroidx/leanback/transition/FadeAndShortSlide;->addListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p7, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p7, p0}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p7, p8}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 106
    .line 107
    .line 108
    return-object p7
.end method

.method public static final d(Landroid/view/View;)Lyx8;
    .locals 3

    .line 1
    sget v0, Lb46;->coil3_request_manager:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lyx8;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Lyx8;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-nez v0, :cond_3

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :try_start_0
    sget v0, Lb46;->coil3_request_manager:I

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v1, v0, Lyx8;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    move-object v2, v0

    .line 30
    check-cast v2, Lyx8;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_3

    .line 35
    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    new-instance v2, Lyx8;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 44
    .line 45
    .line 46
    sget v0, Lb46;->coil3_request_manager:I

    .line 47
    .line 48
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :goto_2
    monitor-exit p0

    .line 52
    return-object v2

    .line 53
    :goto_3
    monitor-exit p0

    .line 54
    throw v0

    .line 55
    :cond_3
    return-object v0
.end method

.method public static final e(Laj0;Lxy0;Ljf6;)V
    .locals 12

    .line 1
    sget-object v0, Lbs7;->a:Lz47;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {p0}, Laj0;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lz47;->Y:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljk0;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljk0;->b(Ljava/lang/String;)Lcj0;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    new-instance v5, La7;

    .line 21
    .line 22
    invoke-interface {v3}, Lcj0;->s()Laj0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v1, Lmh0;->a:Llh0;

    .line 27
    .line 28
    invoke-direct {v5, p0, v1}, La7;-><init>(Laj0;Lih0;)V

    .line 29
    .line 30
    .line 31
    sget-object v7, Ldq;->g0:Ldq;

    .line 32
    .line 33
    new-instance v2, Ltl0;

    .line 34
    .line 35
    iget-object p0, v0, Lz47;->Z:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v9, p0

    .line 38
    check-cast v9, Lvh0;

    .line 39
    .line 40
    iget-object p0, v0, Lz47;->g0:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v10, p0

    .line 43
    check-cast v10, Lxd6;

    .line 44
    .line 45
    iget-object p0, v0, Lz47;->f0:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v11, p0

    .line 48
    check-cast v11, Lhr8;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    move-object v8, v7

    .line 53
    invoke-direct/range {v2 .. v11}, Ltl0;-><init>(Lcj0;Lcj0;La7;La7;Ldq;Ldq;Lvh0;Lxd6;Lhr8;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, v2, Ltl0;->m0:Ljava/lang/Object;

    .line 57
    .line 58
    monitor-enter p0

    .line 59
    :try_start_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 60
    iget-object p0, p1, Lxy0;->Y:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, Ljava/util/List;

    .line 63
    .line 64
    iget-object v1, v2, Ltl0;->m0:Ljava/lang/Object;

    .line 65
    .line 66
    monitor-enter v1

    .line 67
    :try_start_1
    iput-object p0, v2, Ltl0;->j0:Ljava/util/List;

    .line 68
    .line 69
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 70
    iget-object p0, v2, Ltl0;->m0:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter p0

    .line 73
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 74
    iget-object p0, p1, Lxy0;->Z:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Landroid/util/Range;

    .line 77
    .line 78
    iget-object v1, v2, Ltl0;->m0:Ljava/lang/Object;

    .line 79
    .line 80
    monitor-enter v1

    .line 81
    :try_start_3
    iput-object p0, v2, Ltl0;->k0:Landroid/util/Range;

    .line 82
    .line 83
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 84
    iget-object p0, p1, Lxy0;->h0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, Ljava/util/List;

    .line 87
    .line 88
    const-string p1, "CameraUseCaseAdapter"

    .line 89
    .line 90
    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    iget-object p1, v2, Ltl0;->m0:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter p1

    .line 102
    :try_start_4
    iget-object v0, v2, Ltl0;->X:Lb7;

    .line 103
    .line 104
    iget-object v1, v2, Ltl0;->l0:Lih0;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Lb7;->j(Lih0;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, v2, Ltl0;->Y:Lb7;

    .line 110
    .line 111
    if-eqz v0, :cond_0

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Lb7;->j(Lih0;)V

    .line 114
    .line 115
    .line 116
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 117
    .line 118
    iget-object v1, v2, Ltl0;->g0:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v0, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 124
    .line 125
    .line 126
    invoke-static {v0, p2}, Ltl0;->i(Ljava/util/LinkedHashSet;Ljf6;)Ljava/util/HashMap;

    .line 127
    .line 128
    .line 129
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 130
    :try_start_5
    iget-object p2, v2, Ltl0;->Y:Lb7;

    .line 131
    .line 132
    if-eqz p2, :cond_1

    .line 133
    .line 134
    const/4 p2, 0x1

    .line 135
    goto :goto_0

    .line 136
    :cond_1
    const/4 p2, 0x0

    .line 137
    :goto_0
    invoke-virtual {v2, v0, p2}, Ltl0;->t(Ljava/util/LinkedHashSet;Z)Lwc0;

    .line 138
    .line 139
    .line 140
    move-result-object p2
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 141
    :try_start_6
    invoke-static {p0}, Ltl0;->D(Ljava/util/HashMap;)V

    .line 142
    .line 143
    .line 144
    monitor-exit p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 145
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :catchall_0
    move-exception v0

    .line 150
    move-object p0, v0

    .line 151
    goto :goto_2

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    move-object p2, v0

    .line 154
    goto :goto_1

    .line 155
    :catch_0
    move-exception v0

    .line 156
    move-object p2, v0

    .line 157
    :try_start_7
    new-instance v0, Lnl0;

    .line 158
    .line 159
    invoke-direct {v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 163
    :goto_1
    :try_start_8
    invoke-static {p0}, Ltl0;->D(Ljava/util/HashMap;)V

    .line 164
    .line 165
    .line 166
    throw p2

    .line 167
    :goto_2
    monitor-exit p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 168
    throw p0

    .line 169
    :catchall_2
    move-exception v0

    .line 170
    move-object p0, v0

    .line 171
    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 172
    throw p0

    .line 173
    :catchall_3
    move-exception v0

    .line 174
    move-object p1, v0

    .line 175
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 176
    throw p1

    .line 177
    :catchall_4
    move-exception v0

    .line 178
    move-object p0, v0

    .line 179
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 180
    throw p0

    .line 181
    :catchall_5
    move-exception v0

    .line 182
    move-object p1, v0

    .line 183
    :try_start_c
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 184
    throw p1

    .line 185
    :cond_2
    const-string p0, "mCameraUseCaseAdapterProvider must be initialized first!"

    .line 186
    .line 187
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method
