.class public final Lk91;
.super Ljava/lang/Object;


# instance fields
.field public final a:[B

.field public final b:S


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lch3;->o([B)[B

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lk91;->a:[B

    .line 9
    .line 10
    iput-short p2, p0, Lk91;->b:S

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lk91;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lk91;

    .line 7
    .line 8
    iget-short v0, p1, Lk91;->b:S

    .line 9
    .line 10
    iget-short v1, p0, Lk91;->b:S

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    :goto_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    iget-object p0, p0, Lk91;->a:[B

    .line 17
    .line 18
    iget-object p1, p1, Lk91;->a:[B

    .line 19
    .line 20
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk91;->a:[B

    .line 2
    .line 3
    invoke-static {v0}, Lch3;->H([B)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-short p0, p0, Lk91;->b:S

    .line 8
    .line 9
    xor-int/2addr p0, v0

    .line 10
    return p0
.end method
