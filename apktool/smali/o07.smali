.class public abstract Lo07;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ltk;

.field public static final b:Lug8;

.field public static final c:J

.field public static final d:Lwf7;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ltk;

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    invoke-direct {v0, v1, v1}, Ltk;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lo07;->a:Ltk;

    .line 9
    .line 10
    new-instance v0, Lzx6;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1}, Lzx6;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lzx6;

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-direct {v1, v2}, Lzx6;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lug8;

    .line 23
    .line 24
    invoke-direct {v2, v0, v1}, Lug8;-><init>(Lgn2;Lgn2;)V

    .line 25
    .line 26
    .line 27
    sput-object v2, Lo07;->b:Lug8;

    .line 28
    .line 29
    const v0, 0x3c23d70a    # 0.01f

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    int-to-long v1, v1

    .line 37
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    int-to-long v3, v0

    .line 42
    const/16 v0, 0x20

    .line 43
    .line 44
    shl-long v0, v1, v0

    .line 45
    .line 46
    const-wide v5, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long v2, v3, v5

    .line 52
    .line 53
    or-long/2addr v0, v2

    .line 54
    sput-wide v0, Lo07;->c:J

    .line 55
    .line 56
    new-instance v2, Lwf7;

    .line 57
    .line 58
    new-instance v3, Lz85;

    .line 59
    .line 60
    invoke-direct {v3, v0, v1}, Lz85;-><init>(J)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, v3}, Lwf7;-><init>(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    sput-object v2, Lo07;->d:Lwf7;

    .line 67
    .line 68
    return-void
.end method
