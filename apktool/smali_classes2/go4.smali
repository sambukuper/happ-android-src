.class public final Lgo4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Landroid/content/Intent;

.field public final synthetic j0:Lsu/happ/proxyutility/feature/main/MainViewModel;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lgo4;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lgo4;->i0:Landroid/content/Intent;

    .line 4
    .line 5
    iput-object p2, p0, Lgo4;->j0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lgo4;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lgo4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lgo4;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lgo4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lgo4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lgo4;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lgo4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte p2, p0, Lgo4;->g0:B

    .line 2
    .line 3
    iget-object v0, p0, Lgo4;->j0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 4
    .line 5
    iget-object p0, p0, Lgo4;->i0:Landroid/content/Intent;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p2, Lgo4;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p2, p0, v0, p1, v1}, Lgo4;-><init>(Landroid/content/Intent;Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :pswitch_0
    new-instance p2, Lgo4;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p2, p0, v0, p1, v1}, Lgo4;-><init>(Landroid/content/Intent;Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lgo4;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lgo4;->j0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 6
    .line 7
    iget-object v3, p0, Lgo4;->i0:Landroid/content/Intent;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lc71;->X:Lc71;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-boolean v0, p0, Lgo4;->h0:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    if-ne v0, v7, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object v1, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const-class p1, Lgg8;

    .line 37
    .line 38
    sget-object v0, Lyb6;->a:Lzb6;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {v3, p1}, Lc4;->m(Landroid/content/Intent;Lzu3;)Landroid/os/Parcelable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lgg8;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    new-instance v0, Lfn4;

    .line 53
    .line 54
    invoke-direct {v0, p1}, Lfn4;-><init>(Lgg8;)V

    .line 55
    .line 56
    .line 57
    iput-boolean v7, p0, Lgo4;->h0:Z

    .line 58
    .line 59
    invoke-virtual {v2, v0, p0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->z(Lkn4;Ls51;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-ne p0, v6, :cond_2

    .line 64
    .line 65
    move-object v1, v6

    .line 66
    :cond_2
    :goto_0
    return-object v1

    .line 67
    :pswitch_0
    iget-boolean v0, p0, Lgo4;->h0:Z

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    if-ne v0, v7, :cond_3

    .line 72
    .line 73
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    move-object v1, v4

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const-string p1, "content"

    .line 86
    .line 87
    invoke-virtual {v3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    new-instance v0, Lin4;

    .line 94
    .line 95
    invoke-direct {v0, p1}, Lin4;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iput-boolean v7, p0, Lgo4;->h0:Z

    .line 99
    .line 100
    invoke-virtual {v2, v0, p0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->z(Lkn4;Ls51;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-ne p0, v6, :cond_5

    .line 105
    .line 106
    move-object v1, v6

    .line 107
    :cond_5
    :goto_1
    return-object v1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
