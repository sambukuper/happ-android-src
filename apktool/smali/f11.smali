.class public abstract Lf11;
.super Ljava/util/AbstractQueue;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final Z:I

.field public static final f0:J

.field public static final g0:I


# instance fields
.field public final X:J

.field public final Y:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "sparse.shift"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sput v0, Lf11;->Z:I

    .line 13
    .line 14
    sget-object v1, Lsn8;->a:Lsun/misc/Unsafe;

    .line 15
    .line 16
    const-class v2, [Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x4

    .line 23
    if-ne v4, v3, :cond_0

    .line 24
    .line 25
    add-int/lit8 v3, v0, 0x2

    .line 26
    .line 27
    sput v3, Lf11;->g0:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/16 v4, 0x8

    .line 31
    .line 32
    if-ne v4, v3, :cond_1

    .line 33
    .line 34
    add-int/lit8 v3, v0, 0x3

    .line 35
    .line 36
    sput v3, Lf11;->g0:I

    .line 37
    .line 38
    :goto_0
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/16 v2, 0x20

    .line 43
    .line 44
    sub-int/2addr v3, v0

    .line 45
    shl-int v0, v2, v3

    .line 46
    .line 47
    add-int/2addr v1, v0

    .line 48
    int-to-long v0, v1

    .line 49
    sput-wide v0, Lf11;->f0:J

    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    const-string v0, "Unknown pointer size"

    .line 53
    .line 54
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractQueue;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lu15;->O(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    add-int/lit8 v0, p1, -0x1

    .line 9
    .line 10
    int-to-long v0, v0

    .line 11
    iput-wide v0, p0, Lf11;->X:J

    .line 12
    .line 13
    sget v0, Lf11;->Z:I

    .line 14
    .line 15
    shl-int/2addr p1, v0

    .line 16
    add-int/lit8 p1, p1, 0x40

    .line 17
    .line 18
    new-array p1, p1, [Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p1, p0, Lf11;->Y:[Ljava/lang/Object;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lf11;->X:J

    .line 2
    .line 3
    and-long p0, p1, v0

    .line 4
    .line 5
    sget p2, Lf11;->g0:I

    .line 6
    .line 7
    shl-long/2addr p0, p2

    .line 8
    sget-wide v0, Lf11;->f0:J

    .line 9
    .line 10
    add-long/2addr v0, p0

    .line 11
    return-wide v0
.end method

.method public final clear()V
    .locals 1

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lf11;->poll()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public abstract poll()Ljava/lang/Object;
.end method
