.class public final Lkc3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lpk;


# instance fields
.field public final a:Lhx1;

.field public final b:Lbe6;


# direct methods
.method public constructor <init>(Lhx1;Lbe6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkc3;->a:Lhx1;

    .line 5
    .line 6
    iput-object p2, p0, Lkc3;->b:Lbe6;

    .line 7
    .line 8
    instance-of p0, p1, Lsg8;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast p1, Lsg8;

    .line 13
    .line 14
    iget p0, p1, Lsg8;->a:I

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    iget p0, p1, Lsg8;->b:I

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    instance-of p0, p1, Lcd7;

    .line 24
    .line 25
    if-nez p0, :cond_2

    .line 26
    .line 27
    instance-of p0, p1, Lay3;

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    check-cast p1, Lay3;

    .line 32
    .line 33
    iget-object p0, p1, Lay3;->a:Lzx3;

    .line 34
    .line 35
    iget-short p0, p0, Lzx3;->a:S

    .line 36
    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void

    .line 40
    :cond_2
    const-string p0, "Animation to be infinitely repeated cannot have a 0-duration"

    .line 41
    .line 42
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0
.end method


# virtual methods
.method public final a(Lug8;)Lju8;
    .locals 2

    .line 1
    new-instance v0, Le86;

    .line 2
    .line 3
    iget-object v1, p0, Lkc3;->a:Lhx1;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Lhx1;->a(Lug8;)Llu8;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Lkc3;->b:Lbe6;

    .line 10
    .line 11
    invoke-direct {v0, p1, p0}, Le86;-><init>(Llu8;Lbe6;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lkc3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lkc3;

    .line 6
    .line 7
    iget-object v0, p1, Lkc3;->a:Lhx1;

    .line 8
    .line 9
    iget-object v1, p0, Lkc3;->a:Lhx1;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lkc3;->b:Lbe6;

    .line 18
    .line 19
    iget-object p0, p0, Lkc3;->b:Lbe6;

    .line 20
    .line 21
    if-ne p1, p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lkc3;->a:Lhx1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lkc3;->b:Lbe6;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    mul-int/lit8 p0, p0, 0x1f

    .line 17
    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, p0

    .line 25
    return v0
.end method
