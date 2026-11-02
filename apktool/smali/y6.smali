.class public abstract Ly6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lbo2;
.implements Ljava/io/Serializable;


# instance fields
.field public final X:Ljava/lang/Object;

.field public final Y:Ljava/lang/Class;

.field public final Z:Ljava/lang/String;

.field public final f0:Ljava/lang/String;

.field public final g0:Z

.field public final h0:B

.field public final i0:I


# direct methods
.method public constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ly6;->X:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, Ly6;->Y:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p4, p0, Ly6;->Z:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Ly6;->f0:Ljava/lang/String;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    iput-boolean p2, p0, Ly6;->g0:Z

    .line 14
    .line 15
    iput-byte p1, p0, Ly6;->h0:B

    .line 16
    .line 17
    shr-int/lit8 p1, p6, 0x1

    .line 18
    .line 19
    iput p1, p0, Ly6;->i0:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Ly6;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Ly6;

    .line 10
    .line 11
    iget-boolean v0, p0, Ly6;->g0:Z

    .line 12
    .line 13
    iget-boolean v1, p1, Ly6;->g0:Z

    .line 14
    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    iget-byte v0, p0, Ly6;->h0:B

    .line 18
    .line 19
    iget-byte v1, p1, Ly6;->h0:B

    .line 20
    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget v0, p0, Ly6;->i0:I

    .line 24
    .line 25
    iget v1, p1, Ly6;->i0:I

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Ly6;->X:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v1, p1, Ly6;->X:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Ly6;->Y:Ljava/lang/Class;

    .line 40
    .line 41
    iget-object v1, p1, Ly6;->Y:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, Ly6;->Z:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, Ly6;->Z:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object p0, p0, Ly6;->f0:Ljava/lang/String;

    .line 60
    .line 61
    iget-object p1, p1, Ly6;->f0:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_2

    .line 68
    .line 69
    :goto_0
    const/4 p0, 0x1

    .line 70
    return p0

    .line 71
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 72
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Ly6;->X:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    const/16 v1, 0x1f

    .line 12
    .line 13
    mul-int/2addr v0, v1

    .line 14
    iget-object v2, p0, Ly6;->Y:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    add-int/2addr v2, v0

    .line 21
    mul-int/2addr v2, v1

    .line 22
    iget-object v0, p0, Ly6;->Z:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v1, v0}, Lpc6;->e(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Ly6;->f0:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lpc6;->e(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, Ly6;->g0:Z

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    const/16 v2, 0x4cf

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/16 v2, 0x4d5

    .line 42
    .line 43
    :goto_1
    add-int/2addr v0, v2

    .line 44
    mul-int/2addr v0, v1

    .line 45
    iget-byte v2, p0, Ly6;->h0:B

    .line 46
    .line 47
    add-int/2addr v0, v2

    .line 48
    mul-int/2addr v0, v1

    .line 49
    iget p0, p0, Ly6;->i0:I

    .line 50
    .line 51
    add-int/2addr v0, p0

    .line 52
    return v0
.end method

.method public final t()I
    .locals 0

    .line 1
    iget-byte p0, p0, Ly6;->h0:B

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lyb6;->a:Lzb6;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lzb6;->i(Lbo2;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
