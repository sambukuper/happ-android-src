.class public final synthetic Lc59;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lc59;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lc59;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lc59;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lc59;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v1, p0

    .line 9
    check-cast v1, Lp50;

    .line 10
    .line 11
    check-cast p1, Lpf3;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    check-cast v6, Lz24;

    .line 15
    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    iget-wide v4, p1, Lpf3;->a:J

    .line 19
    .line 20
    invoke-virtual/range {v1 .. v6}, Lp50;->a(JJLz24;)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    new-instance p2, Lhf3;

    .line 25
    .line 26
    invoke-direct {p2, p0, p1}, Lhf3;-><init>(J)V

    .line 27
    .line 28
    .line 29
    return-object p2

    .line 30
    :pswitch_0
    check-cast p0, Lo50;

    .line 31
    .line 32
    check-cast p1, Lpf3;

    .line 33
    .line 34
    check-cast p2, Lz24;

    .line 35
    .line 36
    iget-wide p1, p1, Lpf3;->a:J

    .line 37
    .line 38
    const-wide v0, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr p1, v0

    .line 44
    long-to-int p1, p1

    .line 45
    const/4 p2, 0x0

    .line 46
    invoke-virtual {p0, p2, p1}, Lo50;->a(II)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    int-to-long p0, p0

    .line 51
    and-long/2addr p0, v0

    .line 52
    new-instance p2, Lhf3;

    .line 53
    .line 54
    invoke-direct {p2, p0, p1}, Lhf3;-><init>(J)V

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
