.class public final Lmn5;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:J


# direct methods
.method public constructor <init>(JLq51;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, Lmn5;->g0:B

    .line 12
    iput-wide p1, p0, Lmn5;->i0:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public synthetic constructor <init>(Lux0;JLq51;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lmn5;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lmn5;->h0:Ljava/lang/Object;

    .line 4
    .line 5
    iput-wide p2, p0, Lmn5;->i0:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lmn5;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lry6;

    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lmn5;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lmn5;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lmn5;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    check-cast p1, Lb71;

    .line 23
    .line 24
    check-cast p2, Lq51;

    .line 25
    .line 26
    invoke-virtual {p0, p2, p1}, Lmn5;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lmn5;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lmn5;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    check-cast p1, Lb71;

    .line 37
    .line 38
    check-cast p2, Lq51;

    .line 39
    .line 40
    invoke-virtual {p0, p2, p1}, Lmn5;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lmn5;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lmn5;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :pswitch_2
    check-cast p1, Lb71;

    .line 51
    .line 52
    check-cast p2, Lq51;

    .line 53
    .line 54
    invoke-virtual {p0, p2, p1}, Lmn5;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Lmn5;

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lmn5;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 10

    .line 1
    iget-byte v0, p0, Lmn5;->g0:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lmn5;

    .line 7
    .line 8
    iget-wide v1, p0, Lmn5;->i0:J

    .line 9
    .line 10
    invoke-direct {v0, v1, v2, p1}, Lmn5;-><init>(JLq51;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, v0, Lmn5;->h0:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance v3, Lmn5;

    .line 17
    .line 18
    iget-object p2, p0, Lmn5;->h0:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, p2

    .line 21
    check-cast v4, Lux0;

    .line 22
    .line 23
    iget-wide v5, p0, Lmn5;->i0:J

    .line 24
    .line 25
    const/4 v8, 0x2

    .line 26
    move-object v7, p1

    .line 27
    invoke-direct/range {v3 .. v8}, Lmn5;-><init>(Lux0;JLq51;B)V

    .line 28
    .line 29
    .line 30
    return-object v3

    .line 31
    :pswitch_1
    move-object v8, p1

    .line 32
    new-instance v4, Lmn5;

    .line 33
    .line 34
    iget-object p1, p0, Lmn5;->h0:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, p1

    .line 37
    check-cast v5, Lux0;

    .line 38
    .line 39
    iget-wide v6, p0, Lmn5;->i0:J

    .line 40
    .line 41
    const/4 v9, 0x1

    .line 42
    invoke-direct/range {v4 .. v9}, Lmn5;-><init>(Lux0;JLq51;B)V

    .line 43
    .line 44
    .line 45
    return-object v4

    .line 46
    :pswitch_2
    move-object v8, p1

    .line 47
    new-instance v4, Lmn5;

    .line 48
    .line 49
    iget-object p1, p0, Lmn5;->h0:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v5, p1

    .line 52
    check-cast v5, Lux0;

    .line 53
    .line 54
    iget-wide v6, p0, Lmn5;->i0:J

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    invoke-direct/range {v4 .. v9}, Lmn5;-><init>(Lux0;JLq51;B)V

    .line 58
    .line 59
    .line 60
    return-object v4

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lmn5;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-wide v2, p0, Lmn5;->i0:J

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lmn5;->h0:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lry6;

    .line 16
    .line 17
    iget-object p0, p0, Lry6;->a:Lsy6;

    .line 18
    .line 19
    iget-object p1, p0, Lsy6;->k:Lxx6;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-virtual {p0, p1, v2, v3, v0}, Lsy6;->d(Lxx6;JI)J

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lmn5;->h0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lux0;

    .line 32
    .line 33
    new-instance p1, Ljava/lang/Long;

    .line 34
    .line 35
    invoke-direct {p1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :pswitch_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Lmn5;->h0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Lux0;

    .line 48
    .line 49
    new-instance p1, Ljava/lang/Long;

    .line 50
    .line 51
    invoke-direct {p1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, Lmn5;->h0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Lux0;

    .line 64
    .line 65
    new-instance p1, Ljava/lang/Long;

    .line 66
    .line 67
    invoke-direct {p1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    return-object v1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
