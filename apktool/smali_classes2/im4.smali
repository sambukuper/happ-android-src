.class public final Lim4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lzl8;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ly42;


# direct methods
.method public synthetic constructor <init>(Ly42;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lim4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lim4;->Y:Ly42;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final y(I)V
    .locals 5

    .line 1
    iget-byte v0, p0, Lim4;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lim4;->Y:Ly42;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ly42;->p:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ldw7;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0, p1}, Ldw7;->l(I)Lpv7;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Ldw7;->l:Lvj4;

    .line 25
    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    sget-object v2, Lho1;->Z:Lho1;

    .line 29
    .line 30
    sget-object v3, Lkw2;->a:Lkw2;

    .line 31
    .line 32
    iget-object p1, p1, Lpv7;->a:Lsu/happ/proxyutility/dto/ServerCache;

    .line 33
    .line 34
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    .line 40
    .line 41
    :try_start_1
    invoke-static {p1}, Lkw2;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    sget v3, La26;->a:I

    .line 53
    .line 54
    invoke-static {p1}, La26;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    :try_start_2
    instance-of v3, p1, Ljava/lang/InterruptedException;

    .line 61
    .line 62
    if-nez v3, :cond_3

    .line 63
    .line 64
    instance-of v3, p1, Ljava/util/concurrent/CancellationException;

    .line 65
    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    new-instance v3, Lrj6;

    .line 69
    .line 70
    invoke-direct {v3, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    move-object p1, v3

    .line 74
    :goto_0
    nop

    .line 75
    instance-of v3, p1, Lrj6;

    .line 76
    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move-object v1, p1

    .line 81
    :goto_1
    check-cast v1, Landroid/graphics/Bitmap;

    .line 82
    .line 83
    :goto_2
    iget-object p1, v0, Lvj4;->a:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 84
    .line 85
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/16 v3, 0x30

    .line 90
    .line 91
    invoke-static {p1, v0, v2, v1, v3}, Lra;->n(Lsu/happ/proxyutility/ui/BaseActivity;Lml2;Lho1;Landroid/graphics/Bitmap;I)V

    .line 92
    .line 93
    .line 94
    sget-object v1, Ldn8;->a:Ldn8;

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :catchall_1
    move-exception p1

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 100
    :goto_3
    instance-of v0, p1, Ljava/lang/InterruptedException;

    .line 101
    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 105
    .line 106
    if-nez v0, :cond_6

    .line 107
    .line 108
    new-instance v1, Lrj6;

    .line 109
    .line 110
    invoke-direct {v1, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    :goto_4
    invoke-static {v1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_5

    .line 118
    .line 119
    iget-object p0, p0, Ldw7;->l:Lvj4;

    .line 120
    .line 121
    if-eqz p0, :cond_5

    .line 122
    .line 123
    sget-object p1, Lho1;->Y:Lho1;

    .line 124
    .line 125
    invoke-static {p0, p1}, Lvj4;->a(Lvj4;Lho1;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    :goto_5
    return-void

    .line 129
    :cond_6
    throw p1

    .line 130
    :pswitch_0
    iget-object p0, p0, Ly42;->p:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p0, Ldw7;

    .line 133
    .line 134
    invoke-virtual {p0, p1}, Ldw7;->l(I)Lpv7;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-nez p1, :cond_7

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_7
    iget-object p0, p0, Ldw7;->m:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 142
    .line 143
    if-eqz p0, :cond_8

    .line 144
    .line 145
    iget-object p1, p1, Lpv7;->a:Lsu/happ/proxyutility/dto/ServerCache;

    .line 146
    .line 147
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/ServerCache;->d()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 155
    .line 156
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    sget-object v2, Ltp1;->a:Lnf1;

    .line 161
    .line 162
    sget-object v2, Ldm4;->a:Lhv2;

    .line 163
    .line 164
    new-instance v3, Lbv;

    .line 165
    .line 166
    const/16 v4, 0x8

    .line 167
    .line 168
    invoke-direct {v3, p0, p1, v1, v4}, Lbv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 169
    .line 170
    .line 171
    const/4 p0, 0x2

    .line 172
    invoke-static {v0, v2, v3, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 173
    .line 174
    .line 175
    :cond_8
    :goto_6
    return-void

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
