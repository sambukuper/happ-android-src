.class public final Lnx;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# static fields
.field public static final Z:Lnx;

.field public static final f0:Lnx;

.field public static final g0:Lnx;


# instance fields
.field public final synthetic Y:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnx;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1}, Lnx;-><init>(BI)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lnx;->Z:Lnx;

    .line 9
    .line 10
    new-instance v0, Lnx;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v2, v1}, Lnx;-><init>(BI)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lnx;->f0:Lnx;

    .line 17
    .line 18
    new-instance v0, Lnx;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v2, v1}, Lnx;-><init>(BI)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lnx;->g0:Lnx;

    .line 25
    .line 26
    return-void
.end method

.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lnx;->Y:B

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lg24;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, Lnx;->Y:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :pswitch_1
    new-instance p0, Lpx;

    .line 12
    .line 13
    invoke-direct {p0}, Lpx;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
