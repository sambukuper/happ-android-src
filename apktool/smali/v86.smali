.class public final Lv86;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lv86;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lv86;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lv86;->X:B

    .line 4
    .line 5
    iget-object v0, v0, Lv86;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->S0:Ld96;

    .line 11
    .line 12
    if-eqz v1, :cond_b

    .line 13
    .line 14
    check-cast v1, Lff1;

    .line 15
    .line 16
    iget-byte v4, v1, Ld96;->d:B

    .line 17
    .line 18
    int-to-long v4, v4

    .line 19
    iget-object v6, v1, Lff1;->h:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    iget-object v8, v1, Lff1;->j:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    iget-object v10, v1, Lff1;->k:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    iget-object v12, v1, Lff1;->i:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v13

    .line 43
    if-eqz v7, :cond_0

    .line 44
    .line 45
    if-eqz v9, :cond_0

    .line 46
    .line 47
    if-eqz v13, :cond_0

    .line 48
    .line 49
    if-eqz v11, :cond_0

    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v14

    .line 57
    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v15

    .line 61
    if-eqz v15, :cond_1

    .line 62
    .line 63
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v15

    .line 67
    check-cast v15, Landroidx/recyclerview/widget/l;

    .line 68
    .line 69
    iget-object v2, v15, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    move-object/from16 v16, v6

    .line 76
    .line 77
    iget-object v6, v1, Lff1;->q:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    move/from16 v17, v7

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    invoke-virtual {v6, v7}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    new-instance v7, Laf1;

    .line 94
    .line 95
    invoke-direct {v7, v1, v15, v3, v2}, Laf1;-><init>(Lff1;Landroidx/recyclerview/widget/l;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6, v7}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 103
    .line 104
    .line 105
    move-object/from16 v6, v16

    .line 106
    .line 107
    move/from16 v7, v17

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    move-object/from16 v16, v6

    .line 111
    .line 112
    move/from16 v17, v7

    .line 113
    .line 114
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->clear()V

    .line 115
    .line 116
    .line 117
    if-nez v9, :cond_3

    .line 118
    .line 119
    new-instance v2, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 125
    .line 126
    .line 127
    iget-object v3, v1, Lff1;->m:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 133
    .line 134
    .line 135
    new-instance v3, Lze1;

    .line 136
    .line 137
    const/4 v6, 0x0

    .line 138
    invoke-direct {v3, v1, v2, v6}, Lze1;-><init>(Lff1;Ljava/util/ArrayList;B)V

    .line 139
    .line 140
    .line 141
    if-nez v17, :cond_2

    .line 142
    .line 143
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Lef1;

    .line 148
    .line 149
    iget-object v2, v2, Lef1;->a:Landroidx/recyclerview/widget/l;

    .line 150
    .line 151
    iget-object v2, v2, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 152
    .line 153
    sget-object v6, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 154
    .line 155
    invoke-virtual {v2, v3, v4, v5}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_2
    invoke-virtual {v3}, Lze1;->run()V

    .line 160
    .line 161
    .line 162
    :cond_3
    :goto_1
    if-nez v11, :cond_5

    .line 163
    .line 164
    new-instance v2, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 170
    .line 171
    .line 172
    iget-object v3, v1, Lff1;->n:Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 178
    .line 179
    .line 180
    new-instance v3, Lze1;

    .line 181
    .line 182
    const/4 v6, 0x1

    .line 183
    invoke-direct {v3, v1, v2, v6}, Lze1;-><init>(Lff1;Ljava/util/ArrayList;B)V

    .line 184
    .line 185
    .line 186
    if-nez v17, :cond_4

    .line 187
    .line 188
    const/4 v6, 0x0

    .line 189
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Ldf1;

    .line 194
    .line 195
    iget-object v2, v2, Ldf1;->a:Landroidx/recyclerview/widget/l;

    .line 196
    .line 197
    iget-object v2, v2, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 198
    .line 199
    sget-object v6, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 200
    .line 201
    invoke-virtual {v2, v3, v4, v5}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_4
    invoke-virtual {v3}, Lze1;->run()V

    .line 206
    .line 207
    .line 208
    :cond_5
    :goto_2
    if-nez v13, :cond_b

    .line 209
    .line 210
    new-instance v2, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 216
    .line 217
    .line 218
    iget-object v3, v1, Lff1;->l:Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 224
    .line 225
    .line 226
    new-instance v3, Lze1;

    .line 227
    .line 228
    const/4 v6, 0x2

    .line 229
    invoke-direct {v3, v1, v2, v6}, Lze1;-><init>(Lff1;Ljava/util/ArrayList;B)V

    .line 230
    .line 231
    .line 232
    if-eqz v17, :cond_7

    .line 233
    .line 234
    if-eqz v9, :cond_7

    .line 235
    .line 236
    if-nez v11, :cond_6

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_6
    invoke-virtual {v3}, Lze1;->run()V

    .line 240
    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_7
    :goto_3
    const-wide/16 v6, 0x0

    .line 244
    .line 245
    if-nez v17, :cond_8

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_8
    move-wide v4, v6

    .line 249
    :goto_4
    if-nez v9, :cond_9

    .line 250
    .line 251
    iget-short v8, v1, Ld96;->e:S

    .line 252
    .line 253
    int-to-long v8, v8

    .line 254
    goto :goto_5

    .line 255
    :cond_9
    move-wide v8, v6

    .line 256
    :goto_5
    if-nez v11, :cond_a

    .line 257
    .line 258
    iget-short v1, v1, Ld96;->f:S

    .line 259
    .line 260
    int-to-long v6, v1

    .line 261
    :cond_a
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 262
    .line 263
    .line 264
    move-result-wide v6

    .line 265
    add-long/2addr v6, v4

    .line 266
    const/4 v1, 0x0

    .line 267
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, Landroidx/recyclerview/widget/l;

    .line 272
    .line 273
    iget-object v2, v2, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 274
    .line 275
    sget-object v4, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 276
    .line 277
    invoke-virtual {v2, v3, v6, v7}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 278
    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_b
    :goto_6
    const/4 v1, 0x0

    .line 282
    :goto_7
    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->q1:Z

    .line 283
    .line 284
    return-void

    .line 285
    :pswitch_0
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 286
    .line 287
    if-eqz v1, :cond_f

    .line 288
    .line 289
    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-eqz v1, :cond_c

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_c
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->y0:Z

    .line 297
    .line 298
    if-nez v1, :cond_d

    .line 299
    .line 300
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 301
    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_d
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->D0:Z

    .line 305
    .line 306
    if-eqz v1, :cond_e

    .line 307
    .line 308
    const/4 v6, 0x1

    .line 309
    iput-boolean v6, v0, Landroidx/recyclerview/widget/RecyclerView;->C0:Z

    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_e
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 313
    .line 314
    .line 315
    :cond_f
    :goto_8
    return-void

    .line 316
    nop

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
