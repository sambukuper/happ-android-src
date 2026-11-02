.class public final Lgp0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(IZIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lgp0;->a:I

    .line 5
    .line 6
    iput p3, p0, Lgp0;->b:I

    .line 7
    .line 8
    iput p4, p0, Lgp0;->c:I

    .line 9
    .line 10
    iput p5, p0, Lgp0;->d:I

    .line 11
    .line 12
    iput-boolean p2, p0, Lgp0;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lgp0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lgp0;

    .line 12
    .line 13
    iget v1, p0, Lgp0;->a:I

    .line 14
    .line 15
    iget v3, p1, Lgp0;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lgp0;->b:I

    .line 21
    .line 22
    iget v3, p1, Lgp0;->b:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Lgp0;->c:I

    .line 28
    .line 29
    iget v3, p1, Lgp0;->c:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget v1, p0, Lgp0;->d:I

    .line 35
    .line 36
    iget v3, p1, Lgp0;->d:I

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    iget-boolean p0, p0, Lgp0;->e:Z

    .line 42
    .line 43
    iget-boolean p1, p1, Lgp0;->e:Z

    .line 44
    .line 45
    if-eq p0, p1, :cond_6

    .line 46
    .line 47
    return v2

    .line 48
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lgp0;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lgp0;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Loi0;->e(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lgp0;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Loi0;->e(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lgp0;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Loi0;->e(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean p0, p0, Lgp0;->e:Z

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, Lgp0;->a:I

    .line 2
    .line 3
    iget v1, p0, Lgp0;->b:I

    .line 4
    .line 5
    iget v2, p0, Lgp0;->c:I

    .line 6
    .line 7
    iget v3, p0, Lgp0;->d:I

    .line 8
    .line 9
    iget-boolean p0, p0, Lgp0;->e:Z

    .line 10
    .line 11
    const-string v4, ", preEnd="

    .line 12
    .line 13
    const-string v5, ", originalStart="

    .line 14
    .line 15
    const-string v6, "Change(preStart="

    .line 16
    .line 17
    invoke-static {v0, v6, v1, v4, v5}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, ", originalEnd="

    .line 22
    .line 23
    const-string v4, ", isFromHardwareSource="

    .line 24
    .line 25
    invoke-static {v0, v2, v1, v3, v4}, Loi0;->x(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    invoke-static {v0, p0, v1}, Lp61;->o(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
