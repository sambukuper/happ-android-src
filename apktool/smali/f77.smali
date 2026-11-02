.class public final Lf77;
.super Lk77;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final c:Lh77;


# direct methods
.method public constructor <init>(Lh77;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk77;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf77;->c:Lh77;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Matrix;Lv67;ILandroid/graphics/Canvas;)V
    .locals 20

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    sget-object v3, Lh77;->h:Landroid/graphics/RectF;

    .line 8
    .line 9
    move-object/from16 v3, p0

    .line 10
    .line 11
    iget-object v3, v3, Lf77;->c:Lh77;

    .line 12
    .line 13
    iget v4, v3, Lh77;->f:F

    .line 14
    .line 15
    iget v5, v3, Lh77;->g:F

    .line 16
    .line 17
    new-instance v6, Landroid/graphics/RectF;

    .line 18
    .line 19
    iget v7, v3, Lh77;->b:F

    .line 20
    .line 21
    iget v8, v3, Lh77;->c:F

    .line 22
    .line 23
    iget v9, v3, Lh77;->d:F

    .line 24
    .line 25
    iget v3, v3, Lh77;->e:F

    .line 26
    .line 27
    invoke-direct {v6, v7, v8, v9, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 28
    .line 29
    .line 30
    iget-object v3, v0, Lv67;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Landroid/graphics/Paint;

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    cmpg-float v8, v5, v7

    .line 36
    .line 37
    const/4 v9, 0x1

    .line 38
    const/4 v10, 0x0

    .line 39
    if-gez v8, :cond_0

    .line 40
    .line 41
    move v8, v9

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v8, v10

    .line 44
    :goto_0
    iget-object v11, v0, Lv67;->h:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v11, Landroid/graphics/Path;

    .line 47
    .line 48
    const/4 v12, 0x3

    .line 49
    sget-object v17, Lv67;->k:[I

    .line 50
    .line 51
    const/4 v13, 0x2

    .line 52
    if-eqz v8, :cond_1

    .line 53
    .line 54
    aput v10, v17, v10

    .line 55
    .line 56
    iget v10, v0, Lv67;->c:I

    .line 57
    .line 58
    aput v10, v17, v9

    .line 59
    .line 60
    iget v10, v0, Lv67;->b:I

    .line 61
    .line 62
    aput v10, v17, v13

    .line 63
    .line 64
    iget v10, v0, Lv67;->a:I

    .line 65
    .line 66
    aput v10, v17, v12

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v11}, Landroid/graphics/Path;->rewind()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerX()F

    .line 73
    .line 74
    .line 75
    move-result v14

    .line 76
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 77
    .line 78
    .line 79
    move-result v15

    .line 80
    invoke-virtual {v11, v14, v15}, Landroid/graphics/Path;->moveTo(FF)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v11, v6, v4, v5}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v11}, Landroid/graphics/Path;->close()V

    .line 87
    .line 88
    .line 89
    neg-int v14, v1

    .line 90
    int-to-float v14, v14

    .line 91
    invoke-virtual {v6, v14, v14}, Landroid/graphics/RectF;->inset(FF)V

    .line 92
    .line 93
    .line 94
    aput v10, v17, v10

    .line 95
    .line 96
    iget v10, v0, Lv67;->a:I

    .line 97
    .line 98
    aput v10, v17, v9

    .line 99
    .line 100
    iget v10, v0, Lv67;->b:I

    .line 101
    .line 102
    aput v10, v17, v13

    .line 103
    .line 104
    iget v10, v0, Lv67;->c:I

    .line 105
    .line 106
    aput v10, v17, v12

    .line 107
    .line 108
    :goto_1
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    const/high16 v12, 0x40000000    # 2.0f

    .line 113
    .line 114
    div-float v16, v10, v12

    .line 115
    .line 116
    cmpg-float v7, v16, v7

    .line 117
    .line 118
    if-gtz v7, :cond_2

    .line 119
    .line 120
    return-void

    .line 121
    :cond_2
    int-to-float v1, v1

    .line 122
    div-float v1, v1, v16

    .line 123
    .line 124
    const/high16 v7, 0x3f800000    # 1.0f

    .line 125
    .line 126
    sub-float v1, v7, v1

    .line 127
    .line 128
    sub-float v10, v7, v1

    .line 129
    .line 130
    div-float/2addr v10, v12

    .line 131
    add-float/2addr v10, v1

    .line 132
    sget-object v18, Lv67;->l:[F

    .line 133
    .line 134
    aput v1, v18, v9

    .line 135
    .line 136
    aput v10, v18, v13

    .line 137
    .line 138
    new-instance v13, Landroid/graphics/RadialGradient;

    .line 139
    .line 140
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerX()F

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    .line 145
    .line 146
    .line 147
    move-result v15

    .line 148
    sget-object v19, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 149
    .line 150
    invoke-direct/range {v13 .. v19}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 157
    .line 158
    .line 159
    move-object/from16 v1, p1

    .line 160
    .line 161
    invoke-virtual {v2, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    div-float/2addr v1, v9

    .line 173
    invoke-virtual {v2, v7, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 174
    .line 175
    .line 176
    if-nez v8, :cond_3

    .line 177
    .line 178
    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 179
    .line 180
    invoke-virtual {v2, v11, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 181
    .line 182
    .line 183
    iget-object v0, v0, Lv67;->g:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Landroid/graphics/Paint;

    .line 186
    .line 187
    invoke-virtual {v2, v11, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 188
    .line 189
    .line 190
    :cond_3
    move v2, v4

    .line 191
    const/4 v4, 0x1

    .line 192
    move v0, v5

    .line 193
    move-object v5, v3

    .line 194
    move v3, v0

    .line 195
    move-object/from16 v0, p4

    .line 196
    .line 197
    move-object v1, v6

    .line 198
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Canvas;->restore()V

    .line 202
    .line 203
    .line 204
    return-void
.end method
