.class public final Ljf1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements La94;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;

.field public final Z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc94;)V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    iput-byte v0, p0, Ljf1;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ljf1;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v0, Llt0;->c:Llt0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, v0, Llt0;->a:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljt0;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p1, v1}, Llt0;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Ljt0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    iput-object v1, p0, Ljf1;->Z:Ljava/lang/Object;

    .line 32
    .line 33
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 34
    iput-byte p3, p0, Ljf1;->X:B

    iput-object p1, p0, Ljf1;->Y:Ljava/lang/Object;

    iput-object p2, p0, Ljf1;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkk7;Lfm2;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Ljf1;->X:B

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljf1;->Z:Ljava/lang/Object;

    iput-object p2, p0, Ljf1;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt95;Lz95;Lg94;)V
    .locals 0

    const/4 p2, 0x4

    iput-byte p2, p0, Ljf1;->X:B

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ljf1;->Y:Ljava/lang/Object;

    iput-object p3, p0, Ljf1;->Z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final k(Ld94;Ln84;)V
    .locals 3

    .line 1
    iget-byte v0, p0, Ljf1;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Ljf1;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Ljf1;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Ljt0;

    .line 11
    .line 12
    check-cast v1, Lc94;

    .line 13
    .line 14
    iget-object p0, v2, Ljt0;->a:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v0, p1, p2, v1}, Ljt0;->a(Ljava/util/List;Ld94;Ln84;Lc94;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Ln84;->ON_ANY:Ln84;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ljava/util/List;

    .line 32
    .line 33
    invoke-static {p0, p1, p2, v1}, Ljt0;->a(Ljava/util/List;Ld94;Ln84;Lc94;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    check-cast v1, Lt95;

    .line 38
    .line 39
    sget-object p1, Ly95;->a:[I

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    aget p1, p1, p2

    .line 46
    .line 47
    const/4 p2, 0x1

    .line 48
    if-eq p1, p2, :cond_2

    .line 49
    .line 50
    const/4 p2, 0x2

    .line 51
    if-eq p1, p2, :cond_1

    .line 52
    .line 53
    const/4 p2, 0x3

    .line 54
    if-eq p1, p2, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {v1}, Lk25;->e()V

    .line 58
    .line 59
    .line 60
    check-cast v2, Lg94;

    .line 61
    .line 62
    invoke-virtual {v2, p0}, Lg94;->f(Lc94;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const/4 p0, 0x0

    .line 67
    invoke-virtual {v1, p0}, Lt95;->g(Z)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {v1, p2}, Lt95;->g(Z)V

    .line 72
    .line 73
    .line 74
    :goto_0
    return-void

    .line 75
    :pswitch_1
    sget-object p1, Ln84;->ON_START:Ln84;

    .line 76
    .line 77
    if-ne p2, p1, :cond_3

    .line 78
    .line 79
    check-cast v1, Lg94;

    .line 80
    .line 81
    invoke-virtual {v1, p0}, Lg94;->f(Lc94;)V

    .line 82
    .line 83
    .line 84
    check-cast v2, Lxd6;

    .line 85
    .line 86
    invoke-virtual {v2}, Lxd6;->H()V

    .line 87
    .line 88
    .line 89
    :cond_3
    return-void

    .line 90
    :pswitch_2
    sget-object v0, Ln84;->ON_DESTROY:Ln84;

    .line 91
    .line 92
    if-ne p2, v0, :cond_4

    .line 93
    .line 94
    check-cast v1, Landroid/os/Handler;

    .line 95
    .line 96
    check-cast v2, Lxb;

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1}, Ld94;->h()Lg94;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, p0}, Lg94;->f(Lc94;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    return-void

    .line 109
    :pswitch_3
    check-cast v1, Lfm2;

    .line 110
    .line 111
    check-cast v2, Lkk7;

    .line 112
    .line 113
    iget-object p2, v2, Lkk7;->d:Lml2;

    .line 114
    .line 115
    invoke-virtual {p2}, Lml2;->P()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_5

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    invoke-interface {p1}, Ld94;->h()Lg94;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1, p0}, Lg94;->f(Lc94;)V

    .line 127
    .line 128
    .line 129
    iget-object p0, v1, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 130
    .line 131
    check-cast p0, Landroid/widget/FrameLayout;

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-eqz p0, :cond_6

    .line 138
    .line 139
    invoke-virtual {v2, v1}, Lkk7;->p(Lfm2;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    :goto_1
    return-void

    .line 143
    :pswitch_4
    check-cast v1, Landroidx/lifecycle/DefaultLifecycleObserver;

    .line 144
    .line 145
    sget-object p0, Lif1;->a:[I

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    aget p0, p0, v0

    .line 152
    .line 153
    packed-switch p0, :pswitch_data_1

    .line 154
    .line 155
    .line 156
    invoke-static {}, Lb61;->c()V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :pswitch_5
    const-string p0, "ON_ANY must not been send by anybody"

    .line 161
    .line 162
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :pswitch_6
    invoke-interface {v1, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Ld94;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :pswitch_7
    invoke-interface {v1, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Ld94;)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :pswitch_8
    invoke-interface {v1, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Ld94;)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :pswitch_9
    invoke-interface {v1, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Ld94;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :pswitch_a
    invoke-interface {v1, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Ld94;)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :pswitch_b
    invoke-interface {v1, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onCreate(Ld94;)V

    .line 187
    .line 188
    .line 189
    :goto_2
    check-cast v2, La94;

    .line 190
    .line 191
    if-eqz v2, :cond_7

    .line 192
    .line 193
    invoke-interface {v2, p1, p2}, La94;->k(Ld94;Ln84;)V

    .line 194
    .line 195
    .line 196
    :cond_7
    :goto_3
    return-void

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
