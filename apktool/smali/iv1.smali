.class public final Liv1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic g0:B


# direct methods
.method public synthetic constructor <init>(ILq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Liv1;->g0:B

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte p0, p0, Liv1;->g0:B

    .line 2
    .line 3
    sget-object v0, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, Liv1;->g0:B

    .line 2
    .line 3
    sget-object v0, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ldt5;

    .line 10
    .line 11
    check-cast p2, Lz85;

    .line 12
    .line 13
    iget-wide p0, p2, Lz85;->a:J

    .line 14
    .line 15
    check-cast p3, Lq51;

    .line 16
    .line 17
    new-instance p0, Liv1;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, v1, p3, p1}, Liv1;-><init>(ILq51;B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Liv1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    check-cast p1, Lb71;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 32
    .line 33
    .line 34
    check-cast p3, Lq51;

    .line 35
    .line 36
    new-instance p0, Liv1;

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    invoke-direct {p0, v1, p3, p1}, Liv1;-><init>(ILq51;B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Liv1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_1
    check-cast p1, Lb71;

    .line 47
    .line 48
    check-cast p2, Lz85;

    .line 49
    .line 50
    iget-wide p0, p2, Lz85;->a:J

    .line 51
    .line 52
    check-cast p3, Lq51;

    .line 53
    .line 54
    new-instance p0, Liv1;

    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    invoke-direct {p0, v1, p3, p1}, Liv1;-><init>(ILq51;B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Liv1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
