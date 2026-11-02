.class public final Let2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Lxm0;


# direct methods
.method public synthetic constructor <init>(Lxm0;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Let2;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Let2;->i0:Lxm0;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Let2;->g0:B

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
    invoke-virtual {p0, p2, p1}, Let2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Let2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Let2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Let2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Let2;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Let2;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 1

    .line 1
    iget-byte p2, p0, Let2;->g0:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p2, Let2;

    .line 7
    .line 8
    iget-object p0, p0, Let2;->i0:Lxm0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, p1, v0}, Let2;-><init>(Lxm0;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Let2;

    .line 16
    .line 17
    iget-object p0, p0, Let2;->i0:Lxm0;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p2, p0, p1, v0}, Let2;-><init>(Lxm0;Lq51;B)V

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
    .locals 7

    .line 1
    iget-byte v0, p0, Let2;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Let2;->i0:Lxm0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    sget-object v4, Lc71;->X:Lc71;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    sget-object v6, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Let2;->h0:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-boolean v5, p0, Let2;->h0:Z

    .line 34
    .line 35
    invoke-virtual {v1}, Lxm0;->f()Ldn8;

    .line 36
    .line 37
    .line 38
    if-ne v6, v4, :cond_2

    .line 39
    .line 40
    move-object v2, v4

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    move-object v2, v6

    .line 43
    :goto_1
    return-object v2

    .line 44
    :pswitch_0
    iget-boolean v0, p0, Let2;->h0:Z

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    if-ne v0, v5, :cond_3

    .line 49
    .line 50
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-boolean v5, p0, Let2;->h0:Z

    .line 62
    .line 63
    invoke-virtual {v1}, Lxm0;->f()Ldn8;

    .line 64
    .line 65
    .line 66
    if-ne v6, v4, :cond_5

    .line 67
    .line 68
    move-object v2, v4

    .line 69
    goto :goto_3

    .line 70
    :cond_5
    :goto_2
    move-object v2, v6

    .line 71
    :goto_3
    return-object v2

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
