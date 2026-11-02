.class public final Lwr7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Lsn2;

.field public final synthetic k0:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lsn2;Ljava/lang/String;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lwr7;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lwr7;->j0:Lsn2;

    .line 4
    .line 5
    iput-object p2, p0, Lwr7;->k0:Ljava/lang/String;

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
    iget-byte v0, p0, Lwr7;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lsu/happ/proxyutility/dto/ImportResult;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lwr7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lwr7;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lwr7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lwr7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lwr7;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lwr7;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 3

    .line 1
    iget-byte v0, p0, Lwr7;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lwr7;->k0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lwr7;->j0:Lsn2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Lwr7;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, p0, v1, p1, v2}, Lwr7;-><init>(Lsn2;Ljava/lang/String;Lq51;B)V

    .line 14
    .line 15
    .line 16
    iput-object p2, v0, Lwr7;->i0:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Lwr7;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, p0, v1, p1, v2}, Lwr7;-><init>(Lsn2;Ljava/lang/String;Lq51;B)V

    .line 23
    .line 24
    .line 25
    iput-object p2, v0, Lwr7;->i0:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lwr7;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lwr7;->k0:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lwr7;->j0:Lsn2;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v5, Lc71;->X:Lc71;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lwr7;->i0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lsu/happ/proxyutility/dto/ImportResult;

    .line 21
    .line 22
    iget-boolean v8, p0, Lwr7;->h0:Z

    .line 23
    .line 24
    if-eqz v8, :cond_1

    .line 25
    .line 26
    if-ne v8, v6, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v1, v7

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    iput-object v7, p0, Lwr7;->i0:Ljava/lang/Object;

    .line 43
    .line 44
    iput-boolean v6, p0, Lwr7;->h0:Z

    .line 45
    .line 46
    invoke-interface {v3, v2, v0, p0}, Lsn2;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-ne p0, v5, :cond_2

    .line 51
    .line 52
    move-object v1, v5

    .line 53
    :cond_2
    :goto_0
    return-object v1

    .line 54
    :pswitch_0
    iget-object v0, p0, Lwr7;->i0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lsu/happ/proxyutility/dto/ImportResult;

    .line 57
    .line 58
    iget-boolean v8, p0, Lwr7;->h0:Z

    .line 59
    .line 60
    if-eqz v8, :cond_4

    .line 61
    .line 62
    if-ne v8, v6, :cond_3

    .line 63
    .line 64
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    move-object v1, v7

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    iput-object v7, p0, Lwr7;->i0:Ljava/lang/Object;

    .line 79
    .line 80
    iput-boolean v6, p0, Lwr7;->h0:Z

    .line 81
    .line 82
    invoke-interface {v3, v2, v0, p0}, Lsn2;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, v5, :cond_5

    .line 87
    .line 88
    move-object v1, v5

    .line 89
    :cond_5
    :goto_1
    return-object v1

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
