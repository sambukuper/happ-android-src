.class public final Lze1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/util/ArrayList;

.field public final synthetic Z:Lff1;


# direct methods
.method public synthetic constructor <init>(Lff1;Ljava/util/ArrayList;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lze1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lze1;->Z:Lff1;

    .line 4
    .line 5
    iput-object p2, p0, Lze1;->Y:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget-byte v0, p0, Lze1;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iget-object v3, p0, Lze1;->Y:Ljava/util/ArrayList;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v4, p0, Lze1;->Z:Lff1;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroidx/recyclerview/widget/l;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v5, v1, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget-object v7, v4, Lff1;->o:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    iget-byte v8, v4, Ld96;->c:B

    .line 48
    .line 49
    int-to-long v8, v8

    .line 50
    invoke-virtual {v7, v8, v9}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    new-instance v8, Laf1;

    .line 55
    .line 56
    invoke-direct {v8, v4, v1, v5, v6}, Laf1;-><init>(Lff1;Landroidx/recyclerview/widget/l;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7, v8}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 68
    .line 69
    .line 70
    iget-object p0, v4, Lff1;->l:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    iget-object v6, p0, Lze1;->Z:Lff1;

    .line 85
    .line 86
    if-eqz v4, :cond_5

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    move-object v7, v4

    .line 93
    check-cast v7, Ldf1;

    .line 94
    .line 95
    iget-object v4, v6, Lff1;->r:Ljava/util/ArrayList;

    .line 96
    .line 97
    iget-short v5, v6, Ld96;->f:S

    .line 98
    .line 99
    int-to-long v11, v5

    .line 100
    iget-object v5, v7, Ldf1;->a:Landroidx/recyclerview/widget/l;

    .line 101
    .line 102
    const/4 v8, 0x0

    .line 103
    if-nez v5, :cond_2

    .line 104
    .line 105
    move-object v9, v8

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    iget-object v5, v5, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 108
    .line 109
    move-object v9, v5

    .line 110
    :goto_2
    iget-object v5, v7, Ldf1;->b:Landroidx/recyclerview/widget/l;

    .line 111
    .line 112
    if-eqz v5, :cond_3

    .line 113
    .line 114
    iget-object v8, v5, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 115
    .line 116
    :cond_3
    move-object v13, v8

    .line 117
    if-eqz v9, :cond_4

    .line 118
    .line 119
    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {v5, v11, v12}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    iget-object v5, v7, Ldf1;->a:Landroidx/recyclerview/widget/l;

    .line 128
    .line 129
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    iget v5, v7, Ldf1;->e:I

    .line 133
    .line 134
    iget v10, v7, Ldf1;->c:I

    .line 135
    .line 136
    sub-int/2addr v5, v10

    .line 137
    int-to-float v5, v5

    .line 138
    invoke-virtual {v8, v5}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 139
    .line 140
    .line 141
    iget v5, v7, Ldf1;->f:I

    .line 142
    .line 143
    iget v10, v7, Ldf1;->d:I

    .line 144
    .line 145
    sub-int/2addr v5, v10

    .line 146
    int-to-float v5, v5

    .line 147
    invoke-virtual {v8, v5}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 151
    .line 152
    .line 153
    move-result-object v14

    .line 154
    new-instance v5, Lcf1;

    .line 155
    .line 156
    const/4 v10, 0x0

    .line 157
    invoke-direct/range {v5 .. v10}, Lcf1;-><init>(Lff1;Ldf1;Landroid/view/ViewPropertyAnimator;Landroid/view/View;B)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v14, v5}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v5}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 165
    .line 166
    .line 167
    :cond_4
    if-eqz v13, :cond_1

    .line 168
    .line 169
    invoke-virtual {v13}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    iget-object v5, v7, Ldf1;->b:Landroidx/recyclerview/widget/l;

    .line 174
    .line 175
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    invoke-virtual {v8, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v4, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-virtual {v4, v11, v12}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-virtual {v4, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    new-instance v5, Lcf1;

    .line 195
    .line 196
    const/4 v10, 0x1

    .line 197
    move-object v9, v13

    .line 198
    invoke-direct/range {v5 .. v10}, Lcf1;-><init>(Lff1;Ldf1;Landroid/view/ViewPropertyAnimator;Landroid/view/View;B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, v5}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 211
    .line 212
    .line 213
    iget-object p0, v6, Lff1;->n:Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :pswitch_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    iget-object v5, p0, Lze1;->Z:Lff1;

    .line 228
    .line 229
    if-eqz v2, :cond_8

    .line 230
    .line 231
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    check-cast v2, Lef1;

    .line 236
    .line 237
    iget-object v6, v2, Lef1;->a:Landroidx/recyclerview/widget/l;

    .line 238
    .line 239
    iget v4, v2, Lef1;->b:I

    .line 240
    .line 241
    iget v7, v2, Lef1;->c:I

    .line 242
    .line 243
    iget v8, v2, Lef1;->d:I

    .line 244
    .line 245
    iget v2, v2, Lef1;->e:I

    .line 246
    .line 247
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move v9, v8

    .line 251
    iget-object v8, v6, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 252
    .line 253
    sub-int v4, v9, v4

    .line 254
    .line 255
    sub-int v9, v2, v7

    .line 256
    .line 257
    if-eqz v4, :cond_6

    .line 258
    .line 259
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v2, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 264
    .line 265
    .line 266
    :cond_6
    if-eqz v9, :cond_7

    .line 267
    .line 268
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    invoke-virtual {v2, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 273
    .line 274
    .line 275
    :cond_7
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 276
    .line 277
    .line 278
    move-result-object v10

    .line 279
    iget-object v2, v5, Lff1;->p:Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    iget-short v2, v5, Ld96;->e:S

    .line 285
    .line 286
    int-to-long v11, v2

    .line 287
    invoke-virtual {v10, v11, v12}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    move v7, v4

    .line 292
    new-instance v4, Lbf1;

    .line 293
    .line 294
    invoke-direct/range {v4 .. v10}, Lbf1;-><init>(Lff1;Landroidx/recyclerview/widget/l;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 302
    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 306
    .line 307
    .line 308
    iget-object p0, v5, Lff1;->m:Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
