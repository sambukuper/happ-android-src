.class public final Lxd6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lv06;
.implements Lbw6;
.implements Lxo2;
.implements Lpi8;
.implements Lp95;
.implements Loz6;


# instance fields
.field public final synthetic X:B

.field public Y:Ljava/lang/Object;

.field public Z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 2

    .line 1
    iput-byte p1, p0, Lxd6;->X:B

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    return-void

    .line 15
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lc15;

    .line 19
    .line 20
    const/16 v0, 0x10

    .line 21
    .line 22
    new-array v0, v0, [Ljava/lang/ref/Reference;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {p1, v1, v0}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 36
    .line 37
    return-void

    .line 38
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance p1, Ll97;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-direct {p1, v0}, Ll97;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 48
    .line 49
    new-instance p1, Lqi4;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-direct {p1, v0}, Lqi4;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 56
    .line 57
    return-void

    .line 58
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance p1, Lg55;

    .line 62
    .line 63
    const/16 v0, 0x1d

    .line 64
    .line 65
    invoke-direct {p1, v0}, Lg55;-><init>(B)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 69
    .line 70
    new-instance p1, Lej4;

    .line 71
    .line 72
    const/16 v0, 0x10

    .line 73
    .line 74
    invoke-direct {p1, v0}, Lej4;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 78
    .line 79
    return-void

    .line 80
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 84
    .line 85
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 89
    .line 90
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 97
    .line 98
    return-void

    .line 99
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    const-class p1, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

    .line 103
    .line 104
    sget-object v0, Lsm1;->a:Li26;

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Li26;->b(Ljava/lang/Class;)Lf26;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    check-cast p1, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

    .line 111
    .line 112
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 113
    .line 114
    const-class p1, Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;

    .line 115
    .line 116
    sget-object v0, Lsm1;->a:Li26;

    .line 117
    .line 118
    invoke-virtual {v0, p1}, Li26;->b(Ljava/lang/Class;)Lf26;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    check-cast p1, Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;

    .line 123
    .line 124
    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 125
    .line 126
    return-void

    .line 127
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :sswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 135
    .line 136
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 137
    .line 138
    .line 139
    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 140
    .line 141
    const/16 p1, 0x40

    .line 142
    .line 143
    const/16 v0, 0x3e8

    .line 144
    .line 145
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    new-instance v0, Lc24;

    .line 150
    .line 151
    const/16 v1, 0xfa0

    .line 152
    .line 153
    invoke-direct {v0, p1, v1}, Lc24;-><init>(II)V

    .line 154
    .line 155
    .line 156
    iput-object v0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 157
    .line 158
    return-void

    .line 159
    :sswitch_7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 160
    .line 161
    .line 162
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 163
    .line 164
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 165
    .line 166
    .line 167
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 168
    .line 169
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 170
    .line 171
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 172
    .line 173
    .line 174
    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 175
    .line 176
    return-void

    .line 177
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_7
        0x7 -> :sswitch_6
        0x9 -> :sswitch_5
        0xb -> :sswitch_4
        0x12 -> :sswitch_3
        0x15 -> :sswitch_2
        0x17 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(BLjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 209
    iput-byte p1, p0, Lxd6;->X:B

    iput-object p2, p0, Lxd6;->Z:Ljava/lang/Object;

    iput-object p3, p0, Lxd6;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0xd

    iput-byte v0, p0, Lxd6;->X:B

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw45;->s(Ljava/lang/Object;)V

    .line 179
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 180
    sget v0, Lg56;->common_google_play_services_unknown_issue:I

    .line 181
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    const/16 v0, 0x1a

    iput-byte v0, p0, Lxd6;->X:B

    .line 221
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 222
    invoke-static {p1}, La19;->g(Landroid/view/WindowInsetsAnimation$Bounds;)Lfe3;

    move-result-object v0

    iput-object v0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 223
    invoke-static {p1}, La19;->f(Landroid/view/WindowInsetsAnimation$Bounds;)Lfe3;

    move-result-object p1

    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lem7;)V
    .locals 1

    const/16 p1, 0x1d

    iput-byte p1, p0, Lxd6;->X:B

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 204
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 205
    new-instance p1, Ljava/util/ArrayDeque;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfj4;)V
    .locals 1

    const/16 v0, 0xf

    iput-byte v0, p0, Lxd6;->X:B

    .line 210
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 211
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfv5;Ly5;)V
    .locals 1

    const/16 v0, 0x1c

    iput-byte v0, p0, Lxd6;->X:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 207
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 208
    iput-object p2, p0, Lxd6;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0xa

    iput-byte v0, p0, Lxd6;->X:B

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 193
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 177
    iput-byte p3, p0, Lxd6;->X:B

    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    iput-object p2, p0, Lxd6;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    const/4 v0, 0x1

    iput-byte v0, p0, Lxd6;->X:B

    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 199
    new-instance v0, Lvt;

    const/4 v1, 0x0

    .line 200
    invoke-direct {v0, v1}, Ll97;-><init>(I)V

    .line 201
    iput-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 202
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lpv8;)V
    .locals 1

    const/16 v0, 0x16

    iput-byte v0, p0, Lxd6;->X:B

    .line 215
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 216
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 217
    new-instance p1, Lcf8;

    .line 218
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 219
    iput v0, p1, Lcf8;->a:I

    .line 220
    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu88;Lbm8;)V
    .locals 1

    const/16 v0, 0x10

    iput-byte v0, p0, Lxd6;->X:B

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    iput-object p2, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 196
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    move-result-object p1

    .line 197
    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lul0;)V
    .locals 1

    const/16 v0, 0xc

    iput-byte v0, p0, Lxd6;->X:B

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 213
    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 214
    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwe5;)V
    .locals 2

    const/16 p1, 0x13

    iput-byte p1, p0, Lxd6;->X:B

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    new-instance p1, Lve4;

    const-string v0, "Type parameter upper bound erasure results"

    invoke-direct {p1, v0}, Lve4;-><init>(Ljava/lang/String;)V

    .line 184
    new-instance v0, Lzk3;

    const/16 v1, 0x1a

    invoke-direct {v0, p0, v1}, Lzk3;-><init>(Ljava/lang/Object;B)V

    .line 185
    new-instance v1, Lvz7;

    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 186
    iput-object v1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 187
    new-instance v0, Lzo6;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lzo6;-><init>(Ljava/lang/Object;B)V

    invoke-virtual {p1, v0}, Lve4;->b(Lgn2;)Lpe4;

    move-result-object p1

    iput-object p1, p0, Lxd6;->Z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxv6;B)V
    .locals 1

    iput-byte p2, p0, Lxd6;->X:B

    packed-switch p2, :pswitch_data_0

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    return-void

    .line 189
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 190
    new-instance p2, Lxd6;

    const/4 v0, 0x4

    invoke-direct {p2, p1, v0}, Lxd6;-><init>(Lxv6;B)V

    iput-object p2, p0, Lxd6;->Z:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public static k(Ljava/util/List;)Lch8;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lch8;->Z:Lch8;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lch8;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lch8;-><init>(Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method


# virtual methods
.method public A(Landroidx/recyclerview/widget/l;I)Lrb0;
    .locals 4

    .line 1
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll97;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ll97;->e(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-gez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Ll97;->j(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lsw8;

    .line 18
    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    iget v2, v1, Lsw8;->a:I

    .line 22
    .line 23
    and-int v3, v2, p2

    .line 24
    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    not-int v3, p2

    .line 28
    and-int/2addr v2, v3

    .line 29
    iput v2, v1, Lsw8;->a:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    if-ne p2, v3, :cond_1

    .line 33
    .line 34
    iget-object p2, v1, Lsw8;->b:Lrb0;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/16 v3, 0x8

    .line 38
    .line 39
    if-ne p2, v3, :cond_3

    .line 40
    .line 41
    iget-object p2, v1, Lsw8;->c:Lrb0;

    .line 42
    .line 43
    :goto_0
    and-int/lit8 v2, v2, 0xc

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ll97;->h(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    iput p0, v1, Lsw8;->a:I

    .line 52
    .line 53
    iput-object v0, v1, Lsw8;->b:Lrb0;

    .line 54
    .line 55
    iput-object v0, v1, Lsw8;->c:Lrb0;

    .line 56
    .line 57
    sget-object p0, Lsw8;->d:Ler5;

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ler5;->d(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_2
    return-object p2

    .line 63
    :cond_3
    const-string p0, "Must provide flag PRE or POST"

    .line 64
    .line 65
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    :goto_1
    return-object v0
.end method

.method public B(Lu88;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lxd6;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lrh5;

    .line 8
    .line 9
    iget-object v3, v1, Lu88;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {}, Lyn0;->D()Ldd7;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    invoke-virtual {v4}, Ldd7;->e()Lgn2;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v6, 0x0

    .line 23
    :goto_0
    invoke-static {v4}, Lyn0;->P(Ldd7;)Ldd7;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    :try_start_0
    invoke-virtual {v2}, Lrh5;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    check-cast v8, Lu88;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    invoke-static {v4, v7, v6}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 34
    .line 35
    .line 36
    if-nez v8, :cond_1

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget-boolean v4, v8, Lu88;->g:Z

    .line 43
    .line 44
    iget-object v6, v8, Lu88;->b:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v7, v8, Lu88;->c:Ljava/lang/String;

    .line 47
    .line 48
    iget v9, v8, Lu88;->a:I

    .line 49
    .line 50
    iget-object v10, v8, Lu88;->h:Lf48;

    .line 51
    .line 52
    if-eqz v4, :cond_6

    .line 53
    .line 54
    iget-boolean v4, v1, Lu88;->g:Z

    .line 55
    .line 56
    iget-object v11, v1, Lu88;->b:Ljava/lang/String;

    .line 57
    .line 58
    iget v12, v1, Lu88;->a:I

    .line 59
    .line 60
    if-nez v4, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iget-wide v13, v1, Lu88;->f:J

    .line 64
    .line 65
    move-object v4, v6

    .line 66
    iget-wide v5, v8, Lu88;->f:J

    .line 67
    .line 68
    cmp-long v15, v13, v5

    .line 69
    .line 70
    if-ltz v15, :cond_6

    .line 71
    .line 72
    sub-long/2addr v13, v5

    .line 73
    const-wide/16 v5, 0x1388

    .line 74
    .line 75
    cmp-long v5, v13, v5

    .line 76
    .line 77
    if-ltz v5, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const-string v5, "\n"

    .line 81
    .line 82
    invoke-static {v7, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_6

    .line 87
    .line 88
    const-string v6, "\r\n"

    .line 89
    .line 90
    invoke-static {v7, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    if-eqz v13, :cond_4

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    invoke-static {v3, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v5, :cond_6

    .line 102
    .line 103
    invoke-static {v3, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_5

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    iget-object v5, v1, Lu88;->h:Lf48;

    .line 111
    .line 112
    if-eq v10, v5, :cond_7

    .line 113
    .line 114
    :cond_6
    :goto_1
    const/4 v5, 0x0

    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :cond_7
    sget-object v5, Lf48;->X:Lf48;

    .line 118
    .line 119
    if-ne v10, v5, :cond_8

    .line 120
    .line 121
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    add-int/2addr v5, v9

    .line 126
    if-ne v5, v12, :cond_8

    .line 127
    .line 128
    new-instance v15, Lu88;

    .line 129
    .line 130
    iget v4, v8, Lu88;->a:I

    .line 131
    .line 132
    invoke-static {v7, v3}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v18

    .line 136
    iget-wide v5, v8, Lu88;->d:J

    .line 137
    .line 138
    iget-wide v9, v1, Lu88;->e:J

    .line 139
    .line 140
    iget-wide v7, v8, Lu88;->f:J

    .line 141
    .line 142
    const/16 v25, 0x0

    .line 143
    .line 144
    const/16 v26, 0x40

    .line 145
    .line 146
    const-string v17, ""

    .line 147
    .line 148
    move/from16 v16, v4

    .line 149
    .line 150
    move-wide/from16 v19, v5

    .line 151
    .line 152
    move-wide/from16 v23, v7

    .line 153
    .line 154
    move-wide/from16 v21, v9

    .line 155
    .line 156
    invoke-direct/range {v15 .. v26}, Lu88;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZI)V

    .line 157
    .line 158
    .line 159
    :goto_2
    move-object v5, v15

    .line 160
    goto :goto_3

    .line 161
    :cond_8
    sget-object v3, Lf48;->Y:Lf48;

    .line 162
    .line 163
    if-ne v10, v3, :cond_6

    .line 164
    .line 165
    invoke-virtual {v8}, Lu88;->a()La48;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v1}, Lu88;->a()La48;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    if-ne v3, v5, :cond_6

    .line 174
    .line 175
    invoke-virtual {v8}, Lu88;->a()La48;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    sget-object v5, La48;->X:La48;

    .line 180
    .line 181
    if-eq v3, v5, :cond_9

    .line 182
    .line 183
    invoke-virtual {v8}, Lu88;->a()La48;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    sget-object v5, La48;->Y:La48;

    .line 188
    .line 189
    if-ne v3, v5, :cond_6

    .line 190
    .line 191
    :cond_9
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    add-int/2addr v3, v12

    .line 196
    if-ne v9, v3, :cond_a

    .line 197
    .line 198
    new-instance v15, Lu88;

    .line 199
    .line 200
    iget v3, v1, Lu88;->a:I

    .line 201
    .line 202
    invoke-static {v11, v4}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v17

    .line 206
    iget-wide v4, v8, Lu88;->d:J

    .line 207
    .line 208
    iget-wide v6, v1, Lu88;->e:J

    .line 209
    .line 210
    iget-wide v8, v8, Lu88;->f:J

    .line 211
    .line 212
    const/16 v25, 0x0

    .line 213
    .line 214
    const/16 v26, 0x40

    .line 215
    .line 216
    const-string v18, ""

    .line 217
    .line 218
    move/from16 v16, v3

    .line 219
    .line 220
    move-wide/from16 v19, v4

    .line 221
    .line 222
    move-wide/from16 v21, v6

    .line 223
    .line 224
    move-wide/from16 v23, v8

    .line 225
    .line 226
    invoke-direct/range {v15 .. v26}, Lu88;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZI)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_a
    iget v3, v8, Lu88;->a:I

    .line 231
    .line 232
    if-ne v3, v12, :cond_6

    .line 233
    .line 234
    move v5, v3

    .line 235
    new-instance v3, Lu88;

    .line 236
    .line 237
    invoke-static {v4, v11}, Lpc6;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    iget-wide v6, v8, Lu88;->d:J

    .line 242
    .line 243
    iget-wide v9, v1, Lu88;->e:J

    .line 244
    .line 245
    iget-wide v11, v8, Lu88;->f:J

    .line 246
    .line 247
    const/4 v13, 0x0

    .line 248
    const/16 v14, 0x40

    .line 249
    .line 250
    move-wide v7, v6

    .line 251
    const-string v6, ""

    .line 252
    .line 253
    move/from16 v27, v5

    .line 254
    .line 255
    move-object v5, v4

    .line 256
    move/from16 v4, v27

    .line 257
    .line 258
    invoke-direct/range {v3 .. v14}, Lu88;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZI)V

    .line 259
    .line 260
    .line 261
    move-object v5, v3

    .line 262
    :goto_3
    if-eqz v5, :cond_b

    .line 263
    .line 264
    invoke-virtual {v2, v5}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_b
    invoke-virtual {v0}, Lxd6;->n()V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :catchall_0
    move-exception v0

    .line 276
    invoke-static {v4, v7, v6}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 277
    .line 278
    .line 279
    throw v0
.end method

.method public C(Landroid/view/View;Lw19;)Lw19;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lxd6;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lh70;

    .line 10
    .line 11
    iget-object v0, v0, Lxd6;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lay8;

    .line 14
    .line 15
    iget v4, v0, Lay8;->a:I

    .line 16
    .line 17
    iget v5, v0, Lay8;->b:I

    .line 18
    .line 19
    iget v0, v0, Lay8;->c:I

    .line 20
    .line 21
    iget-object v6, v2, Lw19;->a:Lt19;

    .line 22
    .line 23
    const/16 v7, 0x207

    .line 24
    .line 25
    invoke-virtual {v6, v7}, Lt19;->h(I)Lfe3;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    const/16 v8, 0x20

    .line 30
    .line 31
    invoke-virtual {v6, v8}, Lt19;->h(I)Lfe3;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object v8, v3, Lh70;->Z:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 38
    .line 39
    iget v9, v7, Lfe3;->b:I

    .line 40
    .line 41
    iget v10, v7, Lfe3;->c:I

    .line 42
    .line 43
    iget v11, v7, Lfe3;->a:I

    .line 44
    .line 45
    iput v9, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x:I

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    const/4 v13, 0x1

    .line 52
    if-ne v9, v13, :cond_0

    .line 53
    .line 54
    move v9, v13

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v9, 0x0

    .line 57
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 58
    .line 59
    .line 60
    move-result v14

    .line 61
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 62
    .line 63
    .line 64
    move-result v15

    .line 65
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 66
    .line 67
    .line 68
    move-result v16

    .line 69
    iget-boolean v12, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    .line 70
    .line 71
    if-eqz v12, :cond_1

    .line 72
    .line 73
    invoke-virtual {v2}, Lw19;->a()I

    .line 74
    .line 75
    .line 76
    move-result v14

    .line 77
    iput v14, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    .line 78
    .line 79
    add-int/2addr v14, v0

    .line 80
    :cond_1
    iget-boolean v0, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    if-eqz v9, :cond_2

    .line 85
    .line 86
    move v0, v5

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move v0, v4

    .line 89
    :goto_1
    add-int v15, v0, v11

    .line 90
    .line 91
    :cond_3
    iget-boolean v0, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->r:Z

    .line 92
    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    if-eqz v9, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move v4, v5

    .line 99
    :goto_2
    add-int v16, v4, v10

    .line 100
    .line 101
    :cond_5
    move/from16 v0, v16

    .line 102
    .line 103
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 108
    .line 109
    iget-boolean v5, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    .line 110
    .line 111
    if-eqz v5, :cond_6

    .line 112
    .line 113
    iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 114
    .line 115
    if-eq v5, v11, :cond_6

    .line 116
    .line 117
    iput v11, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 118
    .line 119
    move v5, v13

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    const/4 v5, 0x0

    .line 122
    :goto_3
    iget-boolean v9, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    .line 123
    .line 124
    if-eqz v9, :cond_7

    .line 125
    .line 126
    iget v9, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 127
    .line 128
    if-eq v9, v10, :cond_7

    .line 129
    .line 130
    iput v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 131
    .line 132
    move v5, v13

    .line 133
    :cond_7
    iget-boolean v9, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:Z

    .line 134
    .line 135
    if-eqz v9, :cond_8

    .line 136
    .line 137
    iget v9, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 138
    .line 139
    iget v7, v7, Lfe3;->b:I

    .line 140
    .line 141
    if-eq v9, v7, :cond_8

    .line 142
    .line 143
    iput v7, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_8
    move v13, v5

    .line 147
    :goto_4
    if-eqz v13, :cond_9

    .line 148
    .line 149
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 150
    .line 151
    .line 152
    :cond_9
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    invoke-virtual {v1, v15, v4, v0, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 157
    .line 158
    .line 159
    iget-boolean v0, v3, Lh70;->Y:Z

    .line 160
    .line 161
    if-eqz v0, :cond_a

    .line 162
    .line 163
    iget v1, v6, Lfe3;->d:I

    .line 164
    .line 165
    iput v1, v8, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:I

    .line 166
    .line 167
    :cond_a
    if-nez v12, :cond_c

    .line 168
    .line 169
    if-eqz v0, :cond_b

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_b
    return-object v2

    .line 173
    :cond_c
    :goto_5
    invoke-virtual {v8}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->V()V

    .line 174
    .line 175
    .line 176
    return-object v2
.end method

.method public D(Ljava/lang/String;Lwv6;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxv6;

    .line 4
    .line 5
    iget-object v0, p0, Lxv6;->c:Lwe5;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lxv6;->d:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lxv6;->d:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    :try_start_1
    const-string p0, "SavedStateProvider with the given key is already registered"

    .line 26
    .line 27
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    :goto_0
    monitor-exit v0

    .line 34
    throw p0
.end method

.method public E(Ls39;)Lbh7;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lfj4;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lfj4;->a(Ls39;)Lbh7;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit v0

    .line 16
    return-object p0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit v0

    .line 19
    throw p0
.end method

.method public F(Landroidx/recyclerview/widget/l;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll97;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ll97;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lsw8;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget p1, p0, Lsw8;->a:I

    .line 15
    .line 16
    and-int/lit8 p1, p1, -0x2

    .line 17
    .line 18
    iput p1, p0, Lsw8;->a:I

    .line 19
    .line 20
    return-void
.end method

.method public G(Landroidx/recyclerview/widget/l;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqi4;

    .line 4
    .line 5
    invoke-virtual {v0}, Lqi4;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    sub-int/2addr v1, v2

    .line 11
    :goto_0
    if-ltz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lqi4;->i(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-ne p1, v3, :cond_0

    .line 18
    .line 19
    iget-object v3, v0, Lqi4;->Z:[Ljava/lang/Object;

    .line 20
    .line 21
    aget-object v4, v3, v1

    .line 22
    .line 23
    sget-object v5, Lu70;->d:Ljava/lang/Object;

    .line 24
    .line 25
    if-eq v4, v5, :cond_1

    .line 26
    .line 27
    aput-object v5, v3, v1

    .line 28
    .line 29
    iput-boolean v2, v0, Lqi4;->X:Z

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ll97;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ll97;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lsw8;

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    iput p1, p0, Lsw8;->a:I

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Lsw8;->b:Lrb0;

    .line 52
    .line 53
    iput-object p1, p0, Lsw8;->c:Lrb0;

    .line 54
    .line 55
    sget-object p1, Lsw8;->d:Ler5;

    .line 56
    .line 57
    invoke-virtual {p1, p0}, Ler5;->d(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public H()V
    .locals 4

    .line 1
    const-class v0, Ld84;

    .line 2
    .line 3
    iget-object v1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lxv6;

    .line 6
    .line 7
    iget-boolean v1, v1, Lxv6;->h:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lfp;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Lfp;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lfp;-><init>(Lxd6;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iput-object v1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lfp;

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object p0, p0, Lfp;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    invoke-interface {p0, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void

    .line 46
    :catch_0
    move-exception p0

    .line 47
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v3, "Class "

    .line 56
    .line 57
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " must have default constructor in order to be automatically recreated"

    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {v1, v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 77
    .line 78
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public I(Lbh7;Lzv7;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ly5;

    .line 7
    .line 8
    new-instance v1, Lj0;

    .line 9
    .line 10
    const/16 v2, 0x11

    .line 11
    .line 12
    invoke-direct {v1, p0, p1, p2, v2}, Lj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    iget-object p0, v0, Ly5;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lh37;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lh37;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public J(Lbh7;I)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ly5;

    .line 7
    .line 8
    new-instance v1, Luj7;

    .line 9
    .line 10
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lfv5;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, p1, v2, p2}, Luj7;-><init>(Lfv5;Lbh7;ZI)V

    .line 16
    .line 17
    .line 18
    iget-object p0, v0, Ly5;->Y:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lh37;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lh37;->execute(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public K(Lwi8;Ljava/util/List;Lnl3;)Lo57;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v1, Lwi8;->a:Lui8;

    .line 8
    .line 9
    new-instance v4, Lo57;

    .line 10
    .line 11
    invoke-direct {v4}, Lo57;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    if-eqz v6, :cond_16

    .line 23
    .line 24
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Lt14;

    .line 29
    .line 30
    invoke-virtual {v5}, Lt14;->n0()Llh8;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-interface {v6}, Llh8;->x()Lot0;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    instance-of v7, v6, Lsx4;

    .line 39
    .line 40
    if-eqz v7, :cond_14

    .line 41
    .line 42
    iget-object v0, v2, Lnl3;->e:Ljava/util/Set;

    .line 43
    .line 44
    invoke-virtual {v5}, Lt14;->q0()Lmo8;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    instance-of v6, v2, Lce2;

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v9, 0x2

    .line 52
    const/16 v11, 0xa

    .line 53
    .line 54
    if-eqz v6, :cond_c

    .line 55
    .line 56
    move-object v6, v2

    .line 57
    check-cast v6, Lce2;

    .line 58
    .line 59
    iget-object v12, v6, Lce2;->Y:Laa7;

    .line 60
    .line 61
    invoke-virtual {v12}, Lt14;->n0()Llh8;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    invoke-interface {v13}, Llh8;->g()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    if-nez v13, :cond_5

    .line 74
    .line 75
    invoke-virtual {v12}, Lt14;->n0()Llh8;

    .line 76
    .line 77
    .line 78
    move-result-object v13

    .line 79
    invoke-interface {v13}, Llh8;->x()Lot0;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    if-nez v13, :cond_0

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_0
    invoke-virtual {v12}, Lt14;->n0()Llh8;

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    invoke-interface {v13}, Llh8;->g()Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v14, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-static {v13, v11}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 100
    .line 101
    .line 102
    move-result v15

    .line 103
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    if-eqz v15, :cond_4

    .line 115
    .line 116
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v15

    .line 120
    check-cast v15, Lhi8;

    .line 121
    .line 122
    invoke-virtual {v5}, Lt14;->l0()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-interface {v15}, Lhi8;->getIndex()I

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    invoke-static {v8, v10}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    check-cast v8, Lni8;

    .line 135
    .line 136
    if-eqz v0, :cond_1

    .line 137
    .line 138
    invoke-interface {v0, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    if-eqz v10, :cond_1

    .line 143
    .line 144
    const/4 v10, 0x1

    .line 145
    goto :goto_1

    .line 146
    :cond_1
    const/4 v10, 0x0

    .line 147
    :goto_1
    if-eqz v8, :cond_2

    .line 148
    .line 149
    if-nez v10, :cond_2

    .line 150
    .line 151
    invoke-virtual {v8}, Lni8;->b()Lt14;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v10}, Lui8;->d(Lt14;)Lni8;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    if-nez v10, :cond_3

    .line 163
    .line 164
    :cond_2
    new-instance v8, Lwg7;

    .line 165
    .line 166
    invoke-direct {v8, v15}, Lwg7;-><init>(Lhi8;)V

    .line 167
    .line 168
    .line 169
    :cond_3
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_4
    invoke-static {v12, v14, v7, v9}, Ls08;->f(Laa7;Ljava/util/List;Lch8;I)Laa7;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    :cond_5
    :goto_2
    iget-object v6, v6, Lce2;->Z:Laa7;

    .line 178
    .line 179
    invoke-virtual {v6}, Lt14;->n0()Llh8;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    invoke-interface {v8}, Llh8;->g()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    if-nez v8, :cond_b

    .line 192
    .line 193
    invoke-virtual {v6}, Lt14;->n0()Llh8;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    invoke-interface {v8}, Llh8;->x()Lot0;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    if-nez v8, :cond_6

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_6
    invoke-virtual {v6}, Lt14;->n0()Llh8;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    invoke-interface {v8}, Llh8;->g()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    new-instance v10, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-static {v8, v11}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v11

    .line 232
    if-eqz v11, :cond_a

    .line 233
    .line 234
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    check-cast v11, Lhi8;

    .line 239
    .line 240
    invoke-virtual {v5}, Lt14;->l0()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v13

    .line 244
    invoke-interface {v11}, Lhi8;->getIndex()I

    .line 245
    .line 246
    .line 247
    move-result v14

    .line 248
    invoke-static {v14, v13}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v13

    .line 252
    check-cast v13, Lni8;

    .line 253
    .line 254
    if-eqz v0, :cond_7

    .line 255
    .line 256
    invoke-interface {v0, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v14

    .line 260
    if-eqz v14, :cond_7

    .line 261
    .line 262
    const/4 v14, 0x1

    .line 263
    goto :goto_4

    .line 264
    :cond_7
    const/4 v14, 0x0

    .line 265
    :goto_4
    if-eqz v13, :cond_8

    .line 266
    .line 267
    if-nez v14, :cond_8

    .line 268
    .line 269
    invoke-virtual {v13}, Lni8;->b()Lt14;

    .line 270
    .line 271
    .line 272
    move-result-object v14

    .line 273
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, v14}, Lui8;->d(Lt14;)Lni8;

    .line 277
    .line 278
    .line 279
    move-result-object v14

    .line 280
    if-nez v14, :cond_9

    .line 281
    .line 282
    :cond_8
    new-instance v13, Lwg7;

    .line 283
    .line 284
    invoke-direct {v13, v11}, Lwg7;-><init>(Lhi8;)V

    .line 285
    .line 286
    .line 287
    :cond_9
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_a
    invoke-static {v6, v10, v7, v9}, Ls08;->f(Laa7;Ljava/util/List;Lch8;I)Laa7;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    :cond_b
    :goto_5
    invoke-static {v12, v6}, Ldh3;->s(Laa7;Laa7;)Lmo8;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    goto/16 :goto_9

    .line 300
    .line 301
    :cond_c
    instance-of v6, v2, Laa7;

    .line 302
    .line 303
    if-eqz v6, :cond_13

    .line 304
    .line 305
    move-object v6, v2

    .line 306
    check-cast v6, Laa7;

    .line 307
    .line 308
    invoke-virtual {v6}, Lt14;->n0()Llh8;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    invoke-interface {v8}, Llh8;->g()Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v8

    .line 316
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    if-nez v8, :cond_12

    .line 321
    .line 322
    invoke-virtual {v6}, Lt14;->n0()Llh8;

    .line 323
    .line 324
    .line 325
    move-result-object v8

    .line 326
    invoke-interface {v8}, Llh8;->x()Lot0;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    if-nez v8, :cond_d

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_d
    invoke-virtual {v6}, Lt14;->n0()Llh8;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    invoke-interface {v8}, Llh8;->g()Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v8

    .line 341
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    new-instance v10, Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-static {v8, v11}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 347
    .line 348
    .line 349
    move-result v11

    .line 350
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 358
    .line 359
    .line 360
    move-result v11

    .line 361
    if-eqz v11, :cond_11

    .line 362
    .line 363
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    check-cast v11, Lhi8;

    .line 368
    .line 369
    invoke-virtual {v5}, Lt14;->l0()Ljava/util/List;

    .line 370
    .line 371
    .line 372
    move-result-object v12

    .line 373
    invoke-interface {v11}, Lhi8;->getIndex()I

    .line 374
    .line 375
    .line 376
    move-result v13

    .line 377
    invoke-static {v13, v12}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v12

    .line 381
    check-cast v12, Lni8;

    .line 382
    .line 383
    if-eqz v0, :cond_e

    .line 384
    .line 385
    invoke-interface {v0, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v13

    .line 389
    if-eqz v13, :cond_e

    .line 390
    .line 391
    const/4 v13, 0x1

    .line 392
    goto :goto_7

    .line 393
    :cond_e
    const/4 v13, 0x0

    .line 394
    :goto_7
    if-eqz v12, :cond_f

    .line 395
    .line 396
    if-nez v13, :cond_f

    .line 397
    .line 398
    invoke-virtual {v12}, Lni8;->b()Lt14;

    .line 399
    .line 400
    .line 401
    move-result-object v13

    .line 402
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v3, v13}, Lui8;->d(Lt14;)Lni8;

    .line 406
    .line 407
    .line 408
    move-result-object v13

    .line 409
    if-nez v13, :cond_10

    .line 410
    .line 411
    :cond_f
    new-instance v12, Lwg7;

    .line 412
    .line 413
    invoke-direct {v12, v11}, Lwg7;-><init>(Lhi8;)V

    .line 414
    .line 415
    .line 416
    :cond_10
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    goto :goto_6

    .line 420
    :cond_11
    invoke-static {v6, v10, v7, v9}, Ls08;->f(Laa7;Ljava/util/List;Lch8;I)Laa7;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    goto :goto_9

    .line 425
    :cond_12
    :goto_8
    move-object v0, v6

    .line 426
    :goto_9
    invoke-static {v0, v2}, Lc18;->g(Lmo8;Lt14;)Lmo8;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    sget-object v2, Lrt8;->g0:Lrt8;

    .line 431
    .line 432
    invoke-virtual {v1, v0, v2}, Lwi8;->f(Lt14;Lrt8;)Lt14;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v4, v0}, Lo57;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    goto :goto_a

    .line 440
    :cond_13
    invoke-static {}, Lb61;->c()V

    .line 441
    .line 442
    .line 443
    return-object v7

    .line 444
    :cond_14
    instance-of v3, v6, Lhi8;

    .line 445
    .line 446
    if-eqz v3, :cond_16

    .line 447
    .line 448
    iget-object v3, v2, Lnl3;->e:Ljava/util/Set;

    .line 449
    .line 450
    if-eqz v3, :cond_15

    .line 451
    .line 452
    invoke-interface {v3, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    const/4 v5, 0x1

    .line 457
    if-ne v3, v5, :cond_15

    .line 458
    .line 459
    invoke-virtual {v0, v2}, Lxd6;->p(Lnl3;)Lmo8;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v4, v0}, Lo57;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    goto :goto_a

    .line 467
    :cond_15
    check-cast v6, Lhi8;

    .line 468
    .line 469
    invoke-interface {v6}, Lhi8;->getUpperBounds()Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0, v1, v3, v2}, Lxd6;->K(Lwi8;Ljava/util/List;Lnl3;)Lo57;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-virtual {v4, v0}, Lo57;->addAll(Ljava/util/Collection;)Z

    .line 481
    .line 482
    .line 483
    :cond_16
    :goto_a
    invoke-static {v4}, Lw45;->m(Lo57;)Lo57;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    return-object v0
.end method

.method public L(Ls39;)Lbh7;
    .locals 1

    .line 1
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lfj4;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lfj4;->c(Ls39;)Lbh7;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0

    .line 16
    throw p0
.end method

.method public M(Ldh8;)Lar3;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lc24;

    .line 5
    .line 6
    new-instance v1, Ldi8;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Ldi8;-><init>(Ldh8;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Lc24;->X:Ljava/io/Serializable;

    .line 12
    .line 13
    check-cast p1, Lwu5;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Lwu5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lar3;

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-object p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p1
.end method

.method public N(Ljava/lang/Class;)Lar3;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lc24;

    .line 5
    .line 6
    new-instance v1, Ldi8;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p1, v2}, Ldi8;-><init>(Ljava/lang/Class;Z)V

    .line 10
    .line 11
    .line 12
    iget-object p1, v0, Lc24;->X:Ljava/io/Serializable;

    .line 13
    .line 14
    check-cast p1, Lwu5;

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Lwu5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lar3;

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-object p1

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1
.end method

.method public U(Lhv6;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrn2;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public a(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    :cond_0
    iget-object v1, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lnv0;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lnv0;->H(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v1, -0x1

    .line 14
    if-eq p1, v1, :cond_2

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ne p1, v2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    return p1

    .line 34
    :cond_2
    :goto_0
    return v1
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lxd6;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Llz;

    .line 7
    .line 8
    iget-byte p1, p1, Llz;->a:B

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    const-string v0, "Unexpected result from SurfaceRequest. Surface was provided twice."

    .line 17
    .line 18
    invoke-static {v0, p1}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    const-string p1, "TextureViewImpl"

    .line 22
    .line 23
    invoke-static {p1}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Landroid/graphics/SurfaceTexture;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, La98;

    .line 36
    .line 37
    iget-object p0, p0, La98;->a:Lb98;

    .line 38
    .line 39
    iget-object p1, p0, Lb98;->j:Landroid/graphics/SurfaceTexture;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-object p1, p0, Lb98;->j:Landroid/graphics/SurfaceTexture;

    .line 45
    .line 46
    :cond_1
    return-void

    .line 47
    :pswitch_0
    check-cast p1, Lby7;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, Lzv7;

    .line 55
    .line 56
    iget-object p0, p0, Lzv7;->X:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Ljg1;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Ljg1;->c(Lby7;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public c(I)I
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnv0;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lnv0;->Q(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, -0x1

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/CharSequence;

    .line 17
    .line 18
    add-int/lit8 v1, p1, -0x1

    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    return p1

    .line 31
    :cond_1
    return v0
.end method

.method public d(Ljava/lang/reflect/Type;)Ldh8;
    .locals 2

    .line 1
    iget-object v0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Luh8;

    .line 4
    .line 5
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lgh8;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1, p1, p0}, Luh8;->b(Llr;Ljava/lang/reflect/Type;Lgh8;)Ldh8;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public e(I)I
    .locals 1

    .line 1
    :cond_0
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnv0;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lnv0;->Q(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, -0x1

    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    iget-object v0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    return p1
.end method

.method public f(I)I
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnv0;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lnv0;->H(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, -0x1

    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    iget-object v0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/CharSequence;

    .line 16
    .line 17
    add-int/lit8 v1, p1, -0x1

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    return p1
.end method

.method public g(Landroidx/recyclerview/widget/l;Lrb0;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ll97;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ll97;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lsw8;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lsw8;->a()Lsw8;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, p1, v0}, Ll97;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-object p2, v0, Lsw8;->c:Lrb0;

    .line 21
    .line 22
    iget p0, v0, Lsw8;->a:I

    .line 23
    .line 24
    or-int/lit8 p0, p0, 0x8

    .line 25
    .line 26
    iput p0, v0, Lsw8;->a:I

    .line 27
    .line 28
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v1, Lf08;

    .line 2
    .line 3
    const/16 v0, 0xd

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lf08;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lf08;

    .line 9
    .line 10
    const/16 v0, 0x9

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lf08;-><init>(B)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lv06;

    .line 18
    .line 19
    invoke-interface {v0}, Lv06;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    check-cast v5, Lv06;

    .line 27
    .line 28
    move-object p0, v0

    .line 29
    new-instance v0, Lwr6;

    .line 30
    .line 31
    move-object v4, p0

    .line 32
    check-cast v4, Ldx6;

    .line 33
    .line 34
    sget-object v3, Lky;->f:Lky;

    .line 35
    .line 36
    invoke-direct/range {v0 .. v5}, Lwr6;-><init>(Lf08;Lf08;Lky;Ldx6;Lv06;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public h(ILaj0;Ljava/util/ArrayList;Ljava/util/ArrayList;Lih0;Landroid/util/Range;Z)Lil7;
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v3, 0x0

    .line 1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {v1}, Laj0;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lhq8;

    .line 8
    iget-object v12, v10, Lhq8;->i:Liz;

    if-eqz v12, :cond_6

    .line 9
    iget-object v13, v0, Lxd6;->Z:Ljava/lang/Object;

    check-cast v13, Lhl0;

    if-eqz v13, :cond_5

    .line 10
    iget-object v14, v10, Lhq8;->h:Ler8;

    invoke-interface {v14}, Le63;->n()I

    move-result v14

    .line 11
    invoke-virtual {v10}, Lhq8;->c()Landroid/util/Size;

    move-result-object v15

    if-eqz v15, :cond_4

    .line 12
    iget-object v3, v10, Lhq8;->h:Ler8;

    .line 13
    invoke-interface {v3}, Ler8;->r()Ljl7;

    move-result-object v3

    const/16 p4, 0x0

    .line 14
    iget-object v11, v13, Lhl0;->d:Ljava/util/Map;

    invoke-interface {v11, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    move-object/from16 v16, v9

    .line 15
    const-string v9, "No such camera id in supported combination list: "

    invoke-virtual {v9, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 16
    invoke-static {v11, v9}, Lmb6;->o(ZLjava/lang/String;)V

    .line 17
    iget-object v9, v13, Lhl0;->c:Ljava/lang/Object;

    monitor-enter v9

    :try_start_0
    iget-object v11, v13, Lhl0;->d:Ljava/util/Map;

    invoke-interface {v11, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lmx7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v9

    if-eqz v11, :cond_3

    move/from16 v9, p1

    .line 18
    invoke-virtual {v11, v9, v14, v15, v3}, Lmx7;->p(IILandroid/util/Size;Ljl7;)Lrx7;

    move-result-object v18

    .line 19
    iget-object v3, v10, Lhq8;->h:Ler8;

    invoke-interface {v3}, Le63;->n()I

    move-result v19

    .line 20
    invoke-virtual {v10}, Lhq8;->c()Landroid/util/Size;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    iget-object v3, v12, Liz;->c:Lpx1;

    .line 22
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 23
    instance-of v13, v10, Lgl7;

    if-eqz v13, :cond_0

    .line 24
    move-object v13, v10

    check-cast v13, Lgl7;

    .line 25
    iget-object v13, v13, Lgl7;->r:Loy8;

    .line 26
    iget-object v13, v13, Loy8;->X:Ljava/util/HashSet;

    .line 27
    invoke-virtual {v13}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lhq8;

    .line 28
    iget-object v14, v14, Lhq8;->h:Ler8;

    .line 29
    invoke-interface {v14}, Ler8;->s()Lgr8;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 30
    :cond_0
    iget-object v13, v10, Lhq8;->h:Ler8;

    .line 31
    invoke-interface {v13}, Ler8;->s()Lgr8;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    :cond_1
    iget-object v13, v12, Liz;->f:Ll11;

    .line 33
    iget-object v14, v10, Lhq8;->h:Ler8;

    .line 34
    sget-object v15, Ler8;->Q:Lzx;

    invoke-interface {v14, v15, v4}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v24

    .line 35
    iget-object v14, v10, Lhq8;->h:Ler8;

    .line 36
    sget-object v15, Liz;->h:Landroid/util/Range;

    move-object/from16 v21, v3

    .line 37
    sget-object v3, Ler8;->R:Lzx;

    invoke-interface {v14, v3, v15}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v25, v3

    check-cast v25, Landroid/util/Range;

    if-eqz v25, :cond_2

    .line 38
    iget-object v3, v10, Lhq8;->h:Ler8;

    .line 39
    sget-object v14, Ler8;->S:Lzx;

    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v3, v14, v15}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v26

    .line 40
    iget-object v3, v10, Lhq8;->h:Ler8;

    .line 41
    invoke-virtual {v10}, Lhq8;->c()Landroid/util/Size;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v3, v14}, Ler8;->v(Landroid/util/Size;)I

    move-result v27

    .line 42
    new-instance v17, Lrx;

    move-object/from16 v22, v11

    move-object/from16 v23, v13

    invoke-direct/range {v17 .. v27}, Lrx;-><init>(Lrx7;ILandroid/util/Size;Lpx1;Ljava/util/List;Ll11;ILandroid/util/Range;ZI)V

    move-object/from16 v3, v17

    .line 43
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    invoke-interface {v8, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    invoke-interface {v7, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v9, v16

    const/4 v3, 0x0

    goto/16 :goto_0

    .line 46
    :cond_2
    const-string v0, "Required value was null."

    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    return-object p4

    .line 47
    :cond_3
    const-string v0, "No such camera id in supported combination list: "

    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 48
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    return-object p4

    :catchall_0
    move-exception v0

    .line 49
    monitor-exit v9

    throw v0

    :cond_4
    const/16 p4, 0x0

    .line 50
    const-string v0, "Attached surface resolution cannot be null for already attached use cases."

    .line 51
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    return-object p4

    :cond_5
    const/16 p4, 0x0

    .line 52
    const-string v0, "Required value was null."

    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    return-object p4

    :cond_6
    const/16 p4, 0x0

    .line 53
    const-string v0, "Attached stream spec cannot be null for already attached use cases."

    .line 54
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    return-object p4

    :cond_7
    move/from16 v9, p1

    const/16 p4, 0x0

    .line 55
    new-instance v3, Landroid/util/Pair;

    invoke-direct {v3, v7, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    iget-object v5, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v5, Ljava/util/Map;

    .line 57
    sget-object v6, Lih0;->c:Lzx;

    sget-object v7, Lhr8;->a:Lfr8;

    move-object/from16 v8, p5

    invoke-interface {v8, v6, v7}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhr8;

    .line 58
    iget-object v7, v0, Lxd6;->Y:Ljava/lang/Object;

    check-cast v7, Lul0;

    move-object/from16 v8, p6

    .line 59
    invoke-static {v2, v6, v7, v8}, Ltl0;->y(Ljava/util/ArrayList;Lhr8;Lhr8;Landroid/util/Range;)Ljava/util/HashMap;

    move-result-object v6

    .line 60
    invoke-interface {v1}, Laj0;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 62
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_45

    .line 63
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 64
    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 65
    :try_start_1
    invoke-interface {v1}, Laj0;->h()Landroid/graphics/Rect;

    move-result-object v12
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-object/from16 v12, p4

    .line 66
    :goto_2
    new-instance v13, Lzv7;

    if-eqz v12, :cond_8

    .line 67
    invoke-static {v12}, Lhd8;->f(Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object v12

    goto :goto_3

    :cond_8
    move-object/from16 v12, p4

    .line 68
    :goto_3
    invoke-direct {v13, v1, v12}, Lzv7;-><init>(Laj0;Landroid/util/Size;)V

    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lhq8;

    .line 70
    invoke-virtual {v6, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    if-eqz v15, :cond_9

    check-cast v15, Lpl0;

    .line 71
    iget-object v9, v15, Lpl0;->a:Ler8;

    .line 72
    iget-object v15, v15, Lpl0;->b:Ler8;

    .line 73
    invoke-virtual {v14, v1, v9, v15}, Lhq8;->p(Laj0;Ler8;Ler8;)Ler8;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    invoke-interface {v10, v9, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    invoke-virtual {v13, v9}, Lzv7;->k(Ler8;)Ljava/util/ArrayList;

    move-result-object v14

    invoke-interface {v11, v9, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v9, p1

    goto :goto_4

    .line 76
    :cond_9
    const-string v0, "Required value was null."

    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    return-object p4

    .line 77
    :cond_a
    new-instance v9, Lgq6;

    const/4 v12, 0x7

    invoke-direct {v9, v6, v1, v12}, Lgq6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {v2, v9}, Lts7;->e(Ljava/util/ArrayList;Lgn2;)Llv8;

    move-result-object v1

    .line 78
    iget-object v0, v0, Lxd6;->Z:Ljava/lang/Object;

    check-cast v0, Lhl0;

    if-eqz v0, :cond_44

    .line 79
    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 80
    invoke-static {v2}, Lts7;->b(Ljava/util/ArrayList;)Z

    move-result v20

    .line 81
    iget-object v2, v0, Lhl0;->d:Ljava/util/Map;

    invoke-interface {v2, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    .line 82
    const-string v9, "No such camera id in supported combination list: "

    invoke-virtual {v9, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 83
    invoke-static {v2, v9}, Lmb6;->o(ZLjava/lang/String;)V

    .line 84
    iget-object v2, v0, Lhl0;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_2
    iget-object v0, v0, Lhl0;->d:Ljava/util/Map;

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmx7;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit v2

    if-eqz v0, :cond_43

    .line 85
    iget-object v2, v0, Lmx7;->y:Lwp1;

    .line 86
    iget-object v7, v2, Lwp1;->c:Ljava/lang/Object;

    .line 87
    monitor-enter v7

    :try_start_3
    invoke-virtual {v2}, Lwp1;->a()Landroid/util/Size;

    move-result-object v9

    iput-object v9, v2, Lwp1;->f:Landroid/util/Size;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v7

    .line 88
    iget-object v2, v0, Lmx7;->v:Lnz;

    if-nez v2, :cond_b

    .line 89
    invoke-virtual {v0}, Lmx7;->b()V

    goto :goto_5

    .line 90
    :cond_b
    iget-object v2, v0, Lmx7;->y:Lwp1;

    invoke-virtual {v2}, Lwp1;->c()Landroid/util/Size;

    move-result-object v24

    .line 91
    invoke-virtual {v0}, Lmx7;->l()Lnz;

    move-result-object v2

    .line 92
    iget-object v2, v2, Lnz;->a:Landroid/util/Size;

    .line 93
    invoke-virtual {v0}, Lmx7;->l()Lnz;

    move-result-object v7

    .line 94
    iget-object v7, v7, Lnz;->b:Ljava/util/LinkedHashMap;

    .line 95
    invoke-virtual {v0}, Lmx7;->l()Lnz;

    move-result-object v9

    .line 96
    iget-object v9, v9, Lnz;->d:Ljava/util/LinkedHashMap;

    .line 97
    invoke-virtual {v0}, Lmx7;->l()Lnz;

    move-result-object v12

    .line 98
    iget-object v12, v12, Lnz;->e:Landroid/util/Size;

    .line 99
    invoke-virtual {v0}, Lmx7;->l()Lnz;

    move-result-object v13

    .line 100
    iget-object v13, v13, Lnz;->f:Ljava/util/LinkedHashMap;

    .line 101
    invoke-virtual {v0}, Lmx7;->l()Lnz;

    move-result-object v14

    .line 102
    iget-object v14, v14, Lnz;->g:Ljava/util/LinkedHashMap;

    .line 103
    invoke-virtual {v0}, Lmx7;->l()Lnz;

    move-result-object v15

    .line 104
    iget-object v15, v15, Lnz;->h:Ljava/util/LinkedHashMap;

    move-object/from16 v22, v2

    .line 105
    invoke-virtual {v0}, Lmx7;->l()Lnz;

    move-result-object v2

    .line 106
    iget-object v2, v2, Lnz;->i:Ljava/util/LinkedHashMap;

    .line 107
    new-instance v21, Lnz;

    move-object/from16 v30, v2

    move-object/from16 v23, v7

    move-object/from16 v25, v9

    move-object/from16 v26, v12

    move-object/from16 v27, v13

    move-object/from16 v28, v14

    move-object/from16 v29, v15

    invoke-direct/range {v21 .. v30}, Lnz;-><init>(Landroid/util/Size;Ljava/util/LinkedHashMap;Landroid/util/Size;Ljava/util/LinkedHashMap;Landroid/util/Size;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V

    move-object/from16 v2, v21

    .line 108
    iput-object v2, v0, Lmx7;->v:Lnz;

    .line 109
    :goto_5
    sget-object v2, Ll03;->f:Landroid/util/Range;

    .line 110
    invoke-virtual {v11}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    new-instance v7, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_c

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 114
    check-cast v13, Lrx;

    .line 115
    iget v13, v13, Lrx;->g:I

    .line 116
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    .line 117
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 118
    :cond_c
    check-cast v2, Ljava/lang/Iterable;

    .line 119
    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 121
    check-cast v13, Ler8;

    .line 122
    sget-object v14, Ler8;->Q:Lzx;

    invoke-interface {v13, v14, v4}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 124
    :cond_d
    invoke-static {v7, v12}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    .line 125
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    const/4 v12, 0x1

    if-eqz v7, :cond_f

    :cond_e
    const/16 v23, 0x0

    goto :goto_8

    .line 126
    :cond_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v13

    if-ne v13, v12, :cond_10

    move/from16 v23, v12

    :goto_8
    if-eqz v23, :cond_13

    .line 127
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_11

    goto :goto_a

    .line 128
    :cond_11
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    if-ne v7, v12, :cond_12

    goto :goto_9

    .line 129
    :cond_12
    const-string v0, "All sessionTypes should be high-speed when any of them is high-speed"

    .line 130
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    return-object p4

    :cond_13
    :goto_a
    if-eqz v23, :cond_19

    .line 131
    iget-object v2, v0, Lmx7;->C:Ll03;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    invoke-virtual {v11}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v7}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Ll03;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    .line 133
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 134
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_15

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Landroid/util/Size;

    .line 135
    iget-object v12, v2, Ll03;->e:Lvz7;

    invoke-virtual {v12}, Lvz7;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    .line 136
    invoke-interface {v12, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_14

    .line 137
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    const/4 v12, 0x1

    goto :goto_b

    .line 138
    :cond_15
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {v11}, Ljava/util/Map;->size()I

    move-result v7

    invoke-static {v7}, Laq4;->G(I)I

    move-result v7

    invoke-direct {v2, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 139
    invoke-virtual {v11}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .line 140
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 141
    check-cast v11, Ljava/util/Map$Entry;

    .line 142
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    .line 143
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    .line 144
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 145
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_17

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object v9, v15

    check-cast v9, Landroid/util/Size;

    .line 146
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_16

    .line 147
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    const/16 v9, 0xa

    goto :goto_d

    .line 148
    :cond_17
    invoke-interface {v2, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v9, 0xa

    goto :goto_c

    :cond_18
    move-object v11, v2

    .line 149
    :cond_19
    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    .line 150
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 151
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 152
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_1a
    :goto_e
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1b

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ler8;

    .line 153
    sget-object v14, Ler8;->P:Lzx;

    invoke-interface {v13, v14, v4}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1a

    .line 155
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 156
    :cond_1b
    invoke-static {v9}, Law0;->b0(Ljava/util/List;)V

    .line 157
    invoke-static {v9}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 158
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    .line 159
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_1d
    :goto_f
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1c

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ler8;

    .line 160
    sget-object v15, Ler8;->P:Lzx;

    invoke-interface {v14, v15, v4}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-ne v12, v15, :cond_1d

    .line 161
    invoke-interface {v2, v14}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 162
    :cond_1e
    iget-object v4, v0, Lmx7;->B:Lo8;

    invoke-virtual {v4, v6, v2, v7}, Lo8;->n(Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object v4

    .line 163
    const-string v9, "CXCP"

    invoke-static {v9}, Lhi5;->i0(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1f

    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    :cond_1f
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_20
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const/16 v13, 0x1005

    if-eqz v12, :cond_21

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lrx;

    .line 166
    iget v12, v12, Lrx;->b:I

    if-ne v12, v13, :cond_20

    :goto_10
    const/16 v22, 0x1

    goto :goto_11

    .line 167
    :cond_21
    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_22
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_23

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ler8;

    .line 168
    invoke-interface {v12}, Le63;->n()I

    move-result v12

    if-ne v12, v13, :cond_22

    goto :goto_10

    :cond_23
    const/16 v22, 0x0

    .line 169
    :goto_11
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-object/from16 v12, p4

    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_26

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lrx;

    .line 170
    iget-boolean v13, v13, Lrx;->i:Z

    if-eqz v12, :cond_25

    .line 171
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    .line 172
    invoke-virtual {v12, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_24

    goto :goto_13

    .line 173
    :cond_24
    const-string v0, "All isStrictFpsRequired should be the same"

    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    return-object p4

    .line 174
    :cond_25
    :goto_13
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    goto :goto_12

    .line 175
    :cond_26
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_29

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ler8;

    .line 176
    sget-object v14, Ler8;->S:Lzx;

    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v13, v14, v15}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v12, :cond_28

    .line 177
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_27

    goto :goto_15

    .line 178
    :cond_27
    const-string v0, "All isStrictFpsRequired should be the same"

    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    return-object p4

    :cond_28
    :goto_15
    move-object v12, v13

    goto :goto_14

    :cond_29
    if-eqz v12, :cond_2a

    .line 179
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    goto :goto_16

    :cond_2a
    const/4 v9, 0x0

    .line 180
    :goto_16
    sget-object v12, Liz;->h:Landroid/util/Range;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_17
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2b

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lrx;

    .line 182
    iget-object v14, v14, Lrx;->h:Landroid/util/Range;

    .line 183
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    invoke-static {v14, v12, v9}, Lmx7;->n(Landroid/util/Range;Landroid/util/Range;Z)Landroid/util/Range;

    move-result-object v12

    goto :goto_17

    .line 185
    :cond_2b
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_18
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2c

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v14

    .line 186
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ler8;

    sget-object v15, Liz;->h:Landroid/util/Range;

    move-object/from16 p3, v2

    .line 187
    sget-object v2, Ler8;->R:Lzx;

    invoke-interface {v14, v2, v15}, Lb76;->a(Lzx;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Range;

    .line 188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    invoke-static {v2, v12, v9}, Lmx7;->n(Landroid/util/Range;Landroid/util/Range;Z)Landroid/util/Range;

    move-result-object v12

    move-object/from16 v2, p3

    goto :goto_18

    :cond_2c
    move-object/from16 p3, v2

    .line 190
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 191
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v27

    .line 192
    sget-object v2, Llv8;->g0:Llv8;

    if-ne v1, v2, :cond_2d

    const/4 v2, 0x1

    goto :goto_19

    :cond_2d
    const/4 v2, 0x0

    .line 193
    :goto_19
    const-string v9, "CXCP"

    invoke-static {v9}, Lhi5;->i0(Ljava/lang/String;)Z

    if-eqz v2, :cond_2f

    .line 194
    iget-boolean v2, v0, Lmx7;->t:Z

    if-nez v2, :cond_2f

    if-nez p7, :cond_2e

    goto :goto_1a

    .line 195
    :cond_2e
    const-string v0, "Preview stabilization is not supported by the camera."

    .line 196
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    return-object p4

    .line 197
    :cond_2f
    :goto_1a
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_30
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_31

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpx1;

    .line 199
    iget v9, v9, Lpx1;->b:I

    const/16 v13, 0xa

    if-ne v9, v13, :cond_30

    move/from16 v19, v13

    goto :goto_1b

    :cond_31
    const/16 v9, 0x8

    move/from16 v19, v9

    .line 200
    :goto_1b
    new-instance v17, Llx7;

    const/16 v25, 0x0

    move/from16 v18, p1

    move/from16 v24, p7

    move-object/from16 v21, v1

    move-object/from16 v26, v12

    invoke-direct/range {v17 .. v27}, Llx7;-><init>(IIZLlv8;ZZZZLandroid/util/Range;Z)V

    move-object/from16 v2, v17

    .line 201
    invoke-virtual {v0, v2}, Lmx7;->s(Llx7;)V

    .line 202
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v9

    if-nez p7, :cond_32

    .line 203
    sget-object v1, Lkx7;->X:Lkx7;

    goto :goto_1d

    .line 204
    :cond_32
    sget-object v13, Lpx1;->e:Lpx1;

    invoke-interface {v9, v13}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v9

    .line 205
    invoke-virtual {v12}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    if-nez v13, :cond_33

    goto :goto_1c

    :cond_33
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    const/16 v14, 0x3c

    if-ne v13, v14, :cond_34

    add-int/lit8 v9, v9, 0x1

    .line 206
    :cond_34
    :goto_1c
    sget-object v13, Llv8;->f0:Llv8;

    if-eq v1, v13, :cond_35

    .line 207
    sget-object v13, Llv8;->g0:Llv8;

    if-ne v1, v13, :cond_36

    :cond_35
    add-int/lit8 v9, v9, 0x1

    :cond_36
    if-eqz v22, :cond_37

    add-int/lit8 v9, v9, 0x1

    :cond_37
    const/4 v1, 0x1

    if-le v9, v1, :cond_38

    .line 208
    sget-object v9, Lkx7;->Y:Lkx7;

    move-object v1, v9

    goto :goto_1d

    :cond_38
    if-ne v9, v1, :cond_39

    .line 209
    sget-object v1, Lkx7;->Z:Lkx7;

    goto :goto_1d

    .line 210
    :cond_39
    sget-object v1, Lkx7;->X:Lkx7;

    .line 211
    :goto_1d
    const-string v9, "CXCP"

    invoke-static {v9}, Lhi5;->i0(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_3a

    .line 212
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 213
    :cond_3a
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v13, 0x37f

    if-eqz v1, :cond_3e

    const/4 v14, 0x1

    if-eq v1, v14, :cond_3c

    const/4 v12, 0x2

    if-ne v1, v12, :cond_3b

    move-object/from16 v1, p4

    const/4 v12, 0x0

    .line 214
    :try_start_4
    invoke-static {v2, v12, v1, v13}, Llx7;->a(Llx7;ZLandroid/util/Range;I)Llx7;

    move-result-object v12

    invoke-virtual {v0, v12}, Lmx7;->s(Llx7;)V
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2

    move-object/from16 v20, p3

    move-object/from16 v16, v0

    move-object/from16 v22, v4

    move-object/from16 v18, v6

    move-object/from16 v21, v7

    move-object/from16 v19, v11

    move-object/from16 v17, v12

    .line 215
    :try_start_5
    invoke-virtual/range {v16 .. v22}, Lmx7;->o(Llx7;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)Liy7;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_1

    goto/16 :goto_1f

    :catch_1
    move-object/from16 v0, v16

    goto :goto_1e

    :catch_2
    move-object/from16 v20, p3

    move-object/from16 v22, v4

    move-object/from16 v18, v6

    move-object/from16 v21, v7

    move-object/from16 v19, v11

    .line 216
    :goto_1e
    invoke-static {v9}, Lhi5;->i0(Ljava/lang/String;)Z

    const/4 v14, 0x1

    .line 217
    invoke-static {v2, v14, v1, v13}, Llx7;->a(Llx7;ZLandroid/util/Range;I)Llx7;

    move-result-object v2

    invoke-virtual {v0, v2}, Lmx7;->s(Llx7;)V

    move-object/from16 v16, v0

    move-object/from16 v17, v2

    .line 218
    invoke-virtual/range {v16 .. v22}, Lmx7;->o(Llx7;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)Liy7;

    move-result-object v0

    goto :goto_1f

    :cond_3b
    move-object/from16 v1, p4

    .line 219
    invoke-static {}, Lb61;->c()V

    return-object v1

    :cond_3c
    move-object/from16 v20, p3

    move-object/from16 v22, v4

    move-object/from16 v18, v6

    move-object/from16 v21, v7

    move-object/from16 v19, v11

    if-eqz p7, :cond_3d

    .line 220
    sget-object v1, Liz;->h:Landroid/util/Range;

    :cond_3d
    const/16 v1, 0x27f

    const/4 v14, 0x1

    .line 221
    invoke-static {v2, v14, v12, v1}, Llx7;->a(Llx7;ZLandroid/util/Range;I)Llx7;

    move-result-object v1

    .line 222
    invoke-virtual {v0, v1}, Lmx7;->s(Llx7;)V

    move-object/from16 v16, v0

    move-object/from16 v17, v1

    .line 223
    invoke-virtual/range {v16 .. v22}, Lmx7;->o(Llx7;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)Liy7;

    move-result-object v0

    goto :goto_1f

    :cond_3e
    move-object/from16 v20, p3

    move-object/from16 v1, p4

    move-object/from16 v22, v4

    move-object/from16 v18, v6

    move-object/from16 v21, v7

    move-object/from16 v19, v11

    const/4 v12, 0x0

    .line 224
    invoke-static {v2, v12, v1, v13}, Llx7;->a(Llx7;ZLandroid/util/Range;I)Llx7;

    move-result-object v2

    invoke-virtual {v0, v2}, Lmx7;->s(Llx7;)V

    move-object/from16 v16, v0

    move-object/from16 v17, v2

    .line 225
    invoke-virtual/range {v16 .. v22}, Lmx7;->o(Llx7;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)Liy7;

    move-result-object v0

    .line 226
    :goto_1f
    iget-object v1, v0, Liy7;->a:Ljava/util/LinkedHashMap;

    .line 227
    iget-object v2, v0, Liy7;->b:Ljava/util/LinkedHashMap;

    .line 228
    iget v0, v0, Liy7;->c:I

    .line 229
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_20
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_40

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 230
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    .line 231
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_3f

    .line 232
    invoke-interface {v8, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_20

    .line 233
    :cond_3f
    const-string v0, "Required value was null."

    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    .line 234
    :cond_40
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_41
    :goto_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_46

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 235
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_41

    .line 236
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_42

    .line 237
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 238
    invoke-interface {v8, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_21

    .line 239
    :cond_42
    const-string v0, "Required value was null."

    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    :catchall_1
    move-exception v0

    .line 240
    monitor-exit v7

    throw v0

    .line 241
    :cond_43
    const-string v0, "No such camera id in supported combination list: "

    invoke-virtual {v0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 242
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1

    :catchall_2
    move-exception v0

    .line 243
    monitor-exit v2

    throw v0

    :cond_44
    move-object/from16 v1, p4

    .line 244
    const-string v0, "Required value was null."

    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    return-object v1

    :cond_45
    const v0, 0x7fffffff

    .line 245
    :cond_46
    new-instance v1, Lil7;

    .line 246
    iget-object v2, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Ljava/util/Map;

    invoke-static {v2, v8}, Lzp4;->L(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    .line 247
    invoke-direct {v1, v2, v0}, Lil7;-><init>(Ljava/util/Map;I)V

    return-object v1
.end method

.method public i(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3

    .line 1
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxv6;

    .line 4
    .line 5
    iget-boolean v0, p0, Lxv6;->g:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-object v0, p0, Lxv6;->f:Landroid/os/Bundle;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-static {p1, v0}, Lx97;->B(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v2, v1

    .line 27
    :goto_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    iput-object v1, p0, Lxv6;->f:Landroid/os/Bundle;

    .line 37
    .line 38
    :cond_2
    return-object v2

    .line 39
    :cond_3
    const-string p0, "You can \'consumeRestoredStateForKey\' only after the corresponding component has moved to the \'CREATED\' state"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v1
.end method

.method public j(Ls39;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lfj4;

    .line 7
    .line 8
    iget-object p0, p0, Lfj4;->a:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit v0

    .line 15
    return p0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0

    .line 18
    throw p0
.end method

.method public l()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    monitor-exit v0

    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public m(IIII)Landroid/view/View;
    .locals 8

    .line 1
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcf8;

    .line 4
    .line 5
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lpv8;

    .line 8
    .line 9
    invoke-interface {p0}, Lpv8;->b()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p0}, Lpv8;->c()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-le p2, p1, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, -0x1

    .line 22
    :goto_0
    const/4 v4, 0x0

    .line 23
    :goto_1
    if-eq p1, p2, :cond_3

    .line 24
    .line 25
    invoke-interface {p0, p1}, Lpv8;->d(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {p0, v5}, Lpv8;->a(Landroid/view/View;)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-interface {p0, v5}, Lpv8;->e(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iput v1, v0, Lcf8;->b:I

    .line 38
    .line 39
    iput v2, v0, Lcf8;->c:I

    .line 40
    .line 41
    iput v6, v0, Lcf8;->d:I

    .line 42
    .line 43
    iput v7, v0, Lcf8;->e:I

    .line 44
    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    iput p3, v0, Lcf8;->a:I

    .line 48
    .line 49
    invoke-virtual {v0}, Lcf8;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    return-object v5

    .line 56
    :cond_1
    if-eqz p4, :cond_2

    .line 57
    .line 58
    iput p4, v0, Lcf8;->a:I

    .line 59
    .line 60
    invoke-virtual {v0}, Lcf8;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    move-object v4, v5

    .line 67
    :cond_2
    add-int/2addr p1, v3

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    return-object v4
.end method

.method public n()V
    .locals 7

    .line 1
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrh5;

    .line 4
    .line 5
    invoke-static {}, Lyn0;->D()Ldd7;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ldd7;->e()Lgn2;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v3, v2

    .line 18
    :goto_0
    invoke-static {v1}, Lyn0;->P(Ldd7;)Ldd7;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    :try_start_0
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, Lu88;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    invoke-static {v1, v4, v3}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 29
    .line 30
    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lbm8;

    .line 36
    .line 37
    iget-object v1, p0, Lbm8;->b:Lvd7;

    .line 38
    .line 39
    iget-object v3, p0, Lbm8;->c:Lvd7;

    .line 40
    .line 41
    invoke-virtual {v3}, Lvd7;->clear()V

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-virtual {v1}, Lvd7;->size()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-virtual {v3}, Lvd7;->size()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    add-int/2addr v6, v4

    .line 53
    iget v4, p0, Lbm8;->a:I

    .line 54
    .line 55
    add-int/lit8 v4, v4, -0x1

    .line 56
    .line 57
    if-le v6, v4, :cond_1

    .line 58
    .line 59
    invoke-static {v1}, Lbw0;->i0(Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {v1, v5}, Lvd7;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-virtual {v0, v2}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    invoke-static {v1, v4, v3}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 72
    .line 73
    .line 74
    throw p0
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;Lgn2;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfj4;

    .line 4
    .line 5
    iget-object v0, v0, Lfj4;->a:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    new-instance v1, Ld97;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, Ld97;-><init>(Lxd6;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p3, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object p2, v1, Ld97;->b:Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 p3, 0xa

    .line 24
    .line 25
    invoke-static {p2, p3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lqg5;

    .line 47
    .line 48
    iget-object v4, v4, Lqg5;->X:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-object v3, v1, Ld97;->c:Lqg5;

    .line 57
    .line 58
    iget-object v3, v3, Lqg5;->X:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v8, v3

    .line 61
    check-cast v8, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v9, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v9, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/16 p1, 0x28

    .line 72
    .line 73
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    sget-object v6, Lcd5;->A0:Lcd5;

    .line 77
    .line 78
    const/16 v7, 0x1e

    .line 79
    .line 80
    const-string v3, ""

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    const/4 v5, 0x0

    .line 84
    invoke-static/range {v2 .. v7}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const/16 p1, 0x29

    .line 92
    .line 93
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    const/4 v2, 0x1

    .line 101
    if-le p1, v2, :cond_1

    .line 102
    .line 103
    const-string p1, "L"

    .line 104
    .line 105
    const/16 v2, 0x3b

    .line 106
    .line 107
    invoke-static {v2, p1, v8}, Lp61;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    :cond_1
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    new-instance v2, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const/16 p0, 0x2e

    .line 124
    .line 125
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iget-object p1, v1, Ld97;->c:Lqg5;

    .line 136
    .line 137
    iget-object p1, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p1, Lrh8;

    .line 140
    .line 141
    new-instance v2, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-static {p2, p3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    invoke-direct {v2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result p3

    .line 158
    if-eqz p3, :cond_2

    .line 159
    .line 160
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    check-cast p3, Lqg5;

    .line 165
    .line 166
    iget-object p3, p3, Lqg5;->Y:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p3, Lrh8;

    .line 169
    .line 170
    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_2
    new-instance p2, Lcs5;

    .line 175
    .line 176
    iget-object p3, v1, Ld97;->a:Ljava/lang/String;

    .line 177
    .line 178
    invoke-direct {p2, p1, v2, p3}, Lcs5;-><init>(Lrh8;Ljava/util/List;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-interface {v0, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    return-void
.end method

.method public p(Lnl3;)Lmo8;
    .locals 0

    .line 1
    iget-object p1, p1, Lnl3;->f:Laa7;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-static {p1}, Ly08;->n(Lt14;)Lmo8;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p1

    .line 13
    :cond_1
    :goto_0
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lvz7;

    .line 16
    .line 17
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lq32;

    .line 22
    .line 23
    return-object p0
.end method

.method public q(Lhi8;Lnl3;)Lt14;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lpe4;

    .line 10
    .line 11
    new-instance v0, Lmi8;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lmi8;-><init>(Lhi8;Lnl3;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lpe4;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lt14;

    .line 21
    .line 22
    return-object p0
.end method

.method public r(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    monitor-enter v0

    .line 19
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Integer;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    :goto_0
    monitor-exit v0

    .line 50
    return p0

    .line 51
    :goto_1
    monitor-exit v0

    .line 52
    throw p0
.end method

.method public s(Ljava/lang/String;)Lwv6;
    .locals 4

    .line 1
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxv6;

    .line 4
    .line 5
    iget-object v0, p0, Lxv6;->c:Lwe5;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object p0, p0, Lxv6;->d:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lwv6;

    .line 42
    .line 43
    invoke-static {v3, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    move-object v2, v1

    .line 50
    :cond_1
    if-eqz v2, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_0
    monitor-exit v0

    .line 56
    return-object v2

    .line 57
    :goto_1
    monitor-exit v0

    .line 58
    throw p0
.end method

.method public t(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/content/res/Resources;

    .line 8
    .line 9
    const-string v1, "string"

    .line 10
    .line 11
    invoke-virtual {p0, p1, v1, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, Lxd6;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Bounds{lower="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lfe3;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, " upper="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lfe3;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, "}"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lxd6;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v0, "SurfaceReleaseFuture did not complete nicely."

    .line 9
    .line 10
    invoke-direct {p0, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lxx7;

    .line 17
    .line 18
    iget p0, p0, Lxx7;->f:I

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    const-string v1, "SurfaceProcessorNode"

    .line 22
    .line 23
    if-ne p0, v0, :cond_0

    .line 24
    .line 25
    instance-of p1, p1, Ljava/util/concurrent/CancellationException;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-static {v1}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p0}, Lv18;->c(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public v(Landroid/view/View;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcf8;

    .line 4
    .line 5
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lpv8;

    .line 8
    .line 9
    invoke-interface {p0}, Lpv8;->b()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {p0}, Lpv8;->c()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-interface {p0, p1}, Lpv8;->a(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-interface {p0, p1}, Lpv8;->e(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    iput v1, v0, Lcf8;->b:I

    .line 26
    .line 27
    iput v2, v0, Lcf8;->c:I

    .line 28
    .line 29
    iput v3, v0, Lcf8;->d:I

    .line 30
    .line 31
    iput p0, v0, Lcf8;->e:I

    .line 32
    .line 33
    const/16 p0, 0x6003

    .line 34
    .line 35
    iput p0, v0, Lcf8;->a:I

    .line 36
    .line 37
    invoke-virtual {v0}, Lcf8;->a()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public w()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxv6;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxv6;->a()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public x(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxv6;

    .line 4
    .line 5
    iget-object v0, p0, Lxv6;->a:Lyv6;

    .line 6
    .line 7
    iget-boolean v1, p0, Lxv6;->e:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lxv6;->a()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {v0}, Ld94;->h()Lg94;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v1, v1, Lg94;->i:Lo84;

    .line 19
    .line 20
    sget-object v2, Lo84;->f0:Lo84;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-gez v1, :cond_3

    .line 27
    .line 28
    iget-boolean v0, p0, Lxv6;->g:Z

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    const-string v1, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-static {v1, p1}, Lx97;->B(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_1
    iput-object v0, p0, Lxv6;->f:Landroid/os/Bundle;

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Lxv6;->g:Z

    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    const-string p0, "SavedStateRegistry was already restored."

    .line 54
    .line 55
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    invoke-interface {v0}, Ld94;->h()Lg94;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget-object p0, p0, Lg94;->i:Lo84;

    .line 64
    .line 65
    const-string p1, "performRestore cannot be called when owner is "

    .line 66
    .line 67
    invoke-static {p0, p1}, Lxw3;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lgn2;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public z(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxv6;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v1, v0, [Lqg5;

    .line 7
    .line 8
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, [Lqg5;

    .line 13
    .line 14
    invoke-static {v0}, Ldh3;->h([Lqg5;)Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lxv6;->f:Landroid/os/Bundle;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lxv6;->c:Lwe5;

    .line 26
    .line 27
    monitor-enter v1

    .line 28
    :try_start_0
    iget-object p0, p0, Lxv6;->d:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/util/Map$Entry;

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/lang/String;

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lwv6;

    .line 61
    .line 62
    invoke-interface {v2}, Lwv6;->a()Landroid/os/Bundle;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    monitor-exit v1

    .line 76
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_2

    .line 81
    .line 82
    const-string p0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 83
    .line 84
    invoke-virtual {p1, p0, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void

    .line 88
    :goto_1
    monitor-exit v1

    .line 89
    throw p0
.end method
