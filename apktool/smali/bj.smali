.class public final Lbj;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# static fields
.field public static final Z:Lbj;

.field public static final f0:Lbj;


# instance fields
.field public final synthetic Y:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbj;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1}, Lbj;-><init>(BI)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lbj;->Z:Lbj;

    .line 9
    .line 10
    new-instance v0, Lbj;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v2, v1}, Lbj;-><init>(BI)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lbj;->f0:Lbj;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lbj;->Y:B

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lg24;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte p0, p0, Lbj;->Y:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Lr12;

    .line 8
    .line 9
    check-cast p2, Lr12;

    .line 10
    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    sget-object p0, Lr12;->Z:Lr12;

    .line 14
    .line 15
    if-ne p2, p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    check-cast p1, Lpf3;

    .line 25
    .line 26
    iget-wide p0, p1, Lpf3;->a:J

    .line 27
    .line 28
    check-cast p2, Lpf3;

    .line 29
    .line 30
    iget-wide p0, p2, Lpf3;->a:J

    .line 31
    .line 32
    sget-object p0, Liz8;->a:Ljava/util/Map;

    .line 33
    .line 34
    new-instance p0, Lpf3;

    .line 35
    .line 36
    const-wide p1, 0x100000001L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-direct {p0, p1, p2}, Lpf3;-><init>(J)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    const/high16 p2, 0x43c80000    # 400.0f

    .line 46
    .line 47
    invoke-static {p1, p2, p0, v0}, Lwl7;->V(FFLjava/lang/Object;I)Lwf7;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
