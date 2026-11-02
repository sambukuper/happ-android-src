.class public final Li81;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh91;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Li81;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Li81;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 3

    .line 1
    iget-byte v0, p0, Li81;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Li81;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Laq6;

    .line 9
    .line 10
    iget-object p0, p0, Laq6;->X:Lz47;

    .line 11
    .line 12
    iget-object p0, p0, Lz47;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroidx/appcompat/widget/AppCompatEditText;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :pswitch_0
    check-cast p0, Lf63;

    .line 22
    .line 23
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lqi3;

    .line 26
    .line 27
    iget-object p0, p0, Lqi3;->Z:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :pswitch_1
    check-cast p0, Lgk5;

    .line 35
    .line 36
    iget-object p0, p0, Lgk5;->X:Lfu6;

    .line 37
    .line 38
    iget-object p0, p0, Lfu6;->f0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :pswitch_2
    check-cast p0, Lq02;

    .line 48
    .line 49
    iget-object p0, p0, Lq02;->Y:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Lqi3;

    .line 52
    .line 53
    iget-object p0, p0, Lqi3;->Z:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0

    .line 60
    :pswitch_3
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v1, 0x0

    .line 67
    if-eqz v0, :cond_0

    .line 68
    .line 69
    new-instance v0, Landroid/view/KeyEvent;

    .line 70
    .line 71
    const/4 v2, 0x4

    .line 72
    invoke-direct {v0, v1, v2}, Landroid/view/KeyEvent;-><init>(II)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_0

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    :cond_0
    return v1

    .line 83
    :pswitch_4
    check-cast p0, Ljr2;

    .line 84
    .line 85
    iget-object p0, p0, Ljr2;->X:Lf63;

    .line 86
    .line 87
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    return p0

    .line 96
    :pswitch_5
    check-cast p0, Llr;

    .line 97
    .line 98
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, Lzz2;

    .line 101
    .line 102
    iget-object p0, p0, Lzz2;->Z:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    return p0

    .line 111
    :pswitch_6
    check-cast p0, Lk81;

    .line 112
    .line 113
    iget-object p0, p0, Lk81;->X:Lfu6;

    .line 114
    .line 115
    iget-object p0, p0, Lfu6;->f0:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    return p0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Li81;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object p0, p0, Li81;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    return v2

    .line 12
    :pswitch_0
    check-cast p0, Lf63;

    .line 13
    .line 14
    iget-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lin5;

    .line 17
    .line 18
    iget-object v0, v0, Lin5;->e:Lxn5;

    .line 19
    .line 20
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lhn5;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    iget-object v0, v0, Lxn5;->X:Ld6;

    .line 29
    .line 30
    iget-object v0, v0, Ld6;->i0:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    sub-int/2addr p0, v3

    .line 35
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    instance-of v0, p0, Lhn5;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    move-object v1, p0

    .line 44
    check-cast v1, Lhn5;

    .line 45
    .line 46
    :cond_0
    if-eqz v1, :cond_1

    .line 47
    .line 48
    iget-object p0, v1, Lhn5;->v:Lf63;

    .line 49
    .line 50
    if-eqz p0, :cond_1

    .line 51
    .line 52
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Lqi3;

    .line 55
    .line 56
    iget-object p0, p0, Lqi3;->Z:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    :cond_1
    return v2

    .line 63
    :pswitch_1
    check-cast p0, Lgk5;

    .line 64
    .line 65
    iget-object v0, p0, Lgk5;->Y:Lik5;

    .line 66
    .line 67
    iget-object v0, v0, Lik5;->c:Luj5;

    .line 68
    .line 69
    iget-object p0, p0, Lgk5;->Z:Lhk5;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    iget-object v0, v0, Luj5;->X:Lc6;

    .line 76
    .line 77
    iget-object v2, v0, Lc6;->k0:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Landroid/view/View;

    .line 80
    .line 81
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 82
    .line 83
    sub-int/2addr p0, v3

    .line 84
    invoke-virtual {v2, p0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    instance-of v2, p0, Lhk5;

    .line 89
    .line 90
    if-eqz v2, :cond_2

    .line 91
    .line 92
    move-object v1, p0

    .line 93
    check-cast v1, Lhk5;

    .line 94
    .line 95
    :cond_2
    if-nez v1, :cond_3

    .line 96
    .line 97
    iget-object p0, v0, Lc6;->m0:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Landroid/widget/LinearLayout;

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    goto :goto_0

    .line 106
    :cond_3
    invoke-virtual {v1}, Lhk5;->r()Lgk5;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    iget-object p0, p0, Lgk5;->X:Lfu6;

    .line 111
    .line 112
    iget-object p0, p0, Lfu6;->f0:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    :goto_0
    return p0

    .line 121
    :pswitch_2
    return v2

    .line 122
    :pswitch_3
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 123
    .line 124
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    new-instance v0, Landroid/view/KeyEvent;

    .line 131
    .line 132
    const/4 v1, 0x4

    .line 133
    invoke-direct {v0, v2, v1}, Landroid/view/KeyEvent;-><init>(II)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v0}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-eqz p0, :cond_4

    .line 141
    .line 142
    move v2, v3

    .line 143
    :cond_4
    return v2

    .line 144
    :pswitch_4
    check-cast p0, Ljr2;

    .line 145
    .line 146
    iget-object v0, p0, Ljr2;->Y:Llr2;

    .line 147
    .line 148
    iget-object v0, v0, Llr2;->c:Laq6;

    .line 149
    .line 150
    iget-object p0, p0, Ljr2;->Z:Lkr2;

    .line 151
    .line 152
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    iget-object v0, v0, Laq6;->X:Lz47;

    .line 157
    .line 158
    iget-object v2, v0, Lz47;->f0:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 161
    .line 162
    sub-int/2addr p0, v3

    .line 163
    invoke-virtual {v2, p0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    instance-of v2, p0, Lkr2;

    .line 168
    .line 169
    if-eqz v2, :cond_5

    .line 170
    .line 171
    move-object v1, p0

    .line 172
    check-cast v1, Lkr2;

    .line 173
    .line 174
    :cond_5
    if-nez v1, :cond_6

    .line 175
    .line 176
    iget-object p0, v0, Lz47;->Z:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p0, Landroidx/appcompat/widget/AppCompatEditText;

    .line 179
    .line 180
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    goto :goto_1

    .line 185
    :cond_6
    iget-object p0, v1, Lkr2;->v:Lvz7;

    .line 186
    .line 187
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    check-cast p0, Ljr2;

    .line 192
    .line 193
    iget-object p0, p0, Ljr2;->X:Lf63;

    .line 194
    .line 195
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 198
    .line 199
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    :goto_1
    return p0

    .line 204
    :pswitch_5
    check-cast p0, Llr;

    .line 205
    .line 206
    iget-object v0, p0, Llr;->Z:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Lj52;

    .line 209
    .line 210
    iget-object v0, v0, Lj52;->d:Lw42;

    .line 211
    .line 212
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast p0, Li52;

    .line 215
    .line 216
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    iget-object v0, v0, Lw42;->X:Lv5;

    .line 221
    .line 222
    iget-object v2, v0, Lv5;->p0:Landroid/view/View;

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 228
    .line 229
    sub-int/2addr p0, v3

    .line 230
    invoke-virtual {v2, p0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    instance-of v2, p0, Li52;

    .line 235
    .line 236
    if-eqz v2, :cond_7

    .line 237
    .line 238
    move-object v1, p0

    .line 239
    check-cast v1, Li52;

    .line 240
    .line 241
    :cond_7
    if-nez v1, :cond_8

    .line 242
    .line 243
    iget-object p0, v0, Lv5;->n0:Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 244
    .line 245
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 246
    .line 247
    .line 248
    move-result p0

    .line 249
    goto :goto_2

    .line 250
    :cond_8
    iget-object p0, v1, Li52;->v:Llr;

    .line 251
    .line 252
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast p0, Lzz2;

    .line 255
    .line 256
    iget-object p0, p0, Lzz2;->Z:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 259
    .line 260
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 261
    .line 262
    .line 263
    move-result p0

    .line 264
    :goto_2
    return p0

    .line 265
    :pswitch_6
    check-cast p0, Lk81;

    .line 266
    .line 267
    iget-object p0, p0, Lk81;->X:Lfu6;

    .line 268
    .line 269
    iget-object p0, p0, Lfu6;->f0:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 272
    .line 273
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    return p0

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Z
    .locals 5

    .line 1
    iget-byte v0, p0, Li81;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, Li81;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Laq6;

    .line 12
    .line 13
    iget-object p0, p0, Laq6;->X:Lz47;

    .line 14
    .line 15
    iget-object p0, p0, Lz47;->f0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    instance-of v0, p0, Lkr2;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move-object v2, p0

    .line 28
    check-cast v2, Lkr2;

    .line 29
    .line 30
    :cond_0
    if-nez v2, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object p0, v2, Lkr2;->v:Lvz7;

    .line 34
    .line 35
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljr2;

    .line 40
    .line 41
    iget-object p0, p0, Ljr2;->X:Lf63;

    .line 42
    .line 43
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    :goto_0
    return v3

    .line 52
    :pswitch_0
    check-cast p0, Lf63;

    .line 53
    .line 54
    iget-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lin5;

    .line 57
    .line 58
    iget-object v0, v0, Lin5;->e:Lxn5;

    .line 59
    .line 60
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, Lhn5;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    iget-object v0, v0, Lxn5;->X:Ld6;

    .line 69
    .line 70
    iget-object v3, v0, Ld6;->i0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 73
    .line 74
    add-int/2addr p0, v1

    .line 75
    invoke-virtual {v3, p0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    instance-of v1, p0, Lhn5;

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    move-object v2, p0

    .line 84
    check-cast v2, Lhn5;

    .line 85
    .line 86
    :cond_2
    if-eqz v2, :cond_3

    .line 87
    .line 88
    iget-object p0, v2, Lhn5;->v:Lf63;

    .line 89
    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, Lqi3;

    .line 95
    .line 96
    iget-object p0, p0, Lqi3;->Z:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    goto :goto_1

    .line 103
    :cond_3
    iget-object p0, v0, Ld6;->Z:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;

    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    :goto_1
    return p0

    .line 112
    :pswitch_1
    check-cast p0, Lgk5;

    .line 113
    .line 114
    iget-object v0, p0, Lgk5;->Y:Lik5;

    .line 115
    .line 116
    iget-object v0, v0, Lik5;->c:Luj5;

    .line 117
    .line 118
    iget-object p0, p0, Lgk5;->Z:Lhk5;

    .line 119
    .line 120
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    iget-object v0, v0, Luj5;->X:Lc6;

    .line 125
    .line 126
    iget-object v1, v0, Lc6;->k0:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Landroid/view/View;

    .line 129
    .line 130
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 131
    .line 132
    add-int/lit8 v4, p0, 0x1

    .line 133
    .line 134
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    instance-of v4, v1, Lhk5;

    .line 139
    .line 140
    if-eqz v4, :cond_4

    .line 141
    .line 142
    check-cast v1, Lhk5;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    move-object v1, v2

    .line 146
    :goto_2
    if-eqz v1, :cond_5

    .line 147
    .line 148
    invoke-virtual {v1}, Lhk5;->r()Lgk5;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    iget-object p0, p0, Lgk5;->X:Lfu6;

    .line 153
    .line 154
    iget-object p0, p0, Lfu6;->f0:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    goto :goto_3

    .line 163
    :cond_5
    iget-object v0, v0, Lc6;->k0:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Landroid/view/View;

    .line 166
    .line 167
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 168
    .line 169
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    instance-of v0, p0, Lhk5;

    .line 174
    .line 175
    if-eqz v0, :cond_6

    .line 176
    .line 177
    move-object v2, p0

    .line 178
    check-cast v2, Lhk5;

    .line 179
    .line 180
    :cond_6
    if-nez v2, :cond_7

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_7
    invoke-virtual {v2}, Lhk5;->r()Lgk5;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    iget-object p0, p0, Lgk5;->X:Lfu6;

    .line 188
    .line 189
    iget-object p0, p0, Lfu6;->f0:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 192
    .line 193
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    :goto_3
    :pswitch_2
    return v3

    .line 198
    :pswitch_3
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 199
    .line 200
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_8

    .line 205
    .line 206
    new-instance v0, Landroid/view/KeyEvent;

    .line 207
    .line 208
    const/4 v2, 0x4

    .line 209
    invoke-direct {v0, v3, v2}, Landroid/view/KeyEvent;-><init>(II)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v0}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    if-eqz p0, :cond_8

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_8
    move v1, v3

    .line 220
    :goto_4
    return v1

    .line 221
    :pswitch_4
    check-cast p0, Ljr2;

    .line 222
    .line 223
    iget-object v0, p0, Ljr2;->Y:Llr2;

    .line 224
    .line 225
    iget-object v0, v0, Llr2;->c:Laq6;

    .line 226
    .line 227
    iget-object p0, p0, Ljr2;->Z:Lkr2;

    .line 228
    .line 229
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    iget-object v0, v0, Laq6;->X:Lz47;

    .line 234
    .line 235
    iget-object v1, v0, Lz47;->f0:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 238
    .line 239
    add-int/lit8 v4, p0, 0x1

    .line 240
    .line 241
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    instance-of v4, v1, Lkr2;

    .line 246
    .line 247
    if-eqz v4, :cond_9

    .line 248
    .line 249
    check-cast v1, Lkr2;

    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_9
    move-object v1, v2

    .line 253
    :goto_5
    if-nez v1, :cond_c

    .line 254
    .line 255
    iget-object v0, v0, Lz47;->f0:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 258
    .line 259
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    instance-of v0, p0, Lkr2;

    .line 264
    .line 265
    if-eqz v0, :cond_a

    .line 266
    .line 267
    move-object v2, p0

    .line 268
    check-cast v2, Lkr2;

    .line 269
    .line 270
    :cond_a
    if-nez v2, :cond_b

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_b
    iget-object p0, v2, Lkr2;->v:Lvz7;

    .line 274
    .line 275
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    check-cast p0, Ljr2;

    .line 280
    .line 281
    iget-object p0, p0, Ljr2;->X:Lf63;

    .line 282
    .line 283
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 286
    .line 287
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    goto :goto_6

    .line 292
    :cond_c
    iget-object p0, v1, Lkr2;->v:Lvz7;

    .line 293
    .line 294
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    check-cast p0, Ljr2;

    .line 299
    .line 300
    iget-object p0, p0, Ljr2;->X:Lf63;

    .line 301
    .line 302
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 305
    .line 306
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    :goto_6
    return v3

    .line 311
    :pswitch_5
    check-cast p0, Llr;

    .line 312
    .line 313
    iget-object v0, p0, Llr;->Z:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Lj52;

    .line 316
    .line 317
    iget-object v0, v0, Lj52;->d:Lw42;

    .line 318
    .line 319
    iget-object p0, p0, Llr;->f0:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast p0, Li52;

    .line 322
    .line 323
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 324
    .line 325
    .line 326
    move-result p0

    .line 327
    iget-object v0, v0, Lw42;->X:Lv5;

    .line 328
    .line 329
    iget-object v0, v0, Lv5;->p0:Landroid/view/View;

    .line 330
    .line 331
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 335
    .line 336
    add-int/2addr p0, v1

    .line 337
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    instance-of v0, p0, Li52;

    .line 342
    .line 343
    if-eqz v0, :cond_d

    .line 344
    .line 345
    move-object v2, p0

    .line 346
    check-cast v2, Li52;

    .line 347
    .line 348
    :cond_d
    if-nez v2, :cond_e

    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_e
    iget-object p0, v2, Li52;->v:Llr;

    .line 352
    .line 353
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast p0, Lzz2;

    .line 356
    .line 357
    iget-object p0, p0, Lzz2;->Z:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 360
    .line 361
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    :goto_7
    return v3

    .line 366
    :pswitch_6
    check-cast p0, Lk81;

    .line 367
    .line 368
    iget-object p0, p0, Lk81;->X:Lfu6;

    .line 369
    .line 370
    iget-object p0, p0, Lfu6;->Z:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast p0, Lcom/blacksquircle/ui/editorkit/widget/TextProcessor;

    .line 373
    .line 374
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 375
    .line 376
    .line 377
    move-result p0

    .line 378
    return p0

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i()Z
    .locals 3

    .line 1
    iget-byte v0, p0, Li81;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Li81;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Laq6;

    .line 9
    .line 10
    iget-object p0, p0, Laq6;->X:Lz47;

    .line 11
    .line 12
    iget-object p0, p0, Lz47;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroidx/appcompat/widget/AppCompatEditText;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :pswitch_0
    check-cast p0, Lf63;

    .line 22
    .line 23
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lqi3;

    .line 26
    .line 27
    iget-object p0, p0, Lqi3;->Z:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :pswitch_1
    check-cast p0, Lgk5;

    .line 35
    .line 36
    iget-object p0, p0, Lgk5;->X:Lfu6;

    .line 37
    .line 38
    iget-object p0, p0, Lfu6;->f0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :pswitch_2
    check-cast p0, Lq02;

    .line 48
    .line 49
    iget-object p0, p0, Lq02;->Y:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Lqi3;

    .line 52
    .line 53
    iget-object p0, p0, Lqi3;->Z:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0

    .line 60
    :pswitch_3
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v1, 0x0

    .line 67
    if-eqz v0, :cond_0

    .line 68
    .line 69
    new-instance v0, Landroid/view/KeyEvent;

    .line 70
    .line 71
    const/4 v2, 0x4

    .line 72
    invoke-direct {v0, v1, v2}, Landroid/view/KeyEvent;-><init>(II)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_0

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    :cond_0
    return v1

    .line 83
    :pswitch_4
    check-cast p0, Ljr2;

    .line 84
    .line 85
    iget-object p0, p0, Ljr2;->X:Lf63;

    .line 86
    .line 87
    iget-object p0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    return p0

    .line 96
    :pswitch_5
    check-cast p0, Llr;

    .line 97
    .line 98
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, Lzz2;

    .line 101
    .line 102
    iget-object p0, p0, Lzz2;->Z:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    return p0

    .line 111
    :pswitch_6
    check-cast p0, Lk81;

    .line 112
    .line 113
    iget-object p0, p0, Lk81;->X:Lfu6;

    .line 114
    .line 115
    iget-object p0, p0, Lfu6;->f0:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    return p0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
