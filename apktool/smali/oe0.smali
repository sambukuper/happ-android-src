.class public final Loe0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# static fields
.field public static final Y:Loe0;

.field public static final Z:Loe0;

.field public static final f0:Loe0;

.field public static final g0:Loe0;


# instance fields
.field public final synthetic X:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Loe0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Loe0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Loe0;->Y:Loe0;

    .line 8
    .line 9
    new-instance v0, Loe0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Loe0;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Loe0;->Z:Loe0;

    .line 16
    .line 17
    new-instance v0, Loe0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Loe0;-><init>(B)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Loe0;->f0:Loe0;

    .line 24
    .line 25
    new-instance v0, Loe0;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Loe0;-><init>(B)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Loe0;->g0:Loe0;

    .line 32
    .line 33
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Loe0;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte p0, p0, Loe0;->X:B

    .line 2
    .line 3
    sget-object v0, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v1, p1

    .line 9
    check-cast v1, Lsv1;

    .line 10
    .line 11
    check-cast p2, Lz85;

    .line 12
    .line 13
    iget-wide v5, p2, Lz85;->a:J

    .line 14
    .line 15
    check-cast p3, Ldw0;

    .line 16
    .line 17
    iget-wide v2, p3, Ldw0;->a:J

    .line 18
    .line 19
    sget-object p0, Lpb7;->a:Lpb7;

    .line 20
    .line 21
    sget p0, Lpb7;->c:F

    .line 22
    .line 23
    invoke-interface {v1, p0}, Lfi1;->h0(F)F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    const/high16 p1, 0x40000000    # 2.0f

    .line 28
    .line 29
    div-float v4, p0, p1

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    const/16 v8, 0x78

    .line 33
    .line 34
    invoke-static/range {v1 .. v8}, Lsv1;->o0(Lsv1;JFJLtv1;I)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    const/4 p0, 0x0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    return-object v0

    .line 41
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 42
    .line 43
    check-cast p2, Lokhttp3/Response;

    .line 44
    .line 45
    check-cast p3, Ls61;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p2}, Lp61;->z(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    :catch_0
    return-object v0

    .line 51
    :catch_1
    move-exception v0

    .line 52
    move-object p0, v0

    .line 53
    throw p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
