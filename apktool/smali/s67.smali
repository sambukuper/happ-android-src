.class public final Ls67;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:B

.field public final d:J

.field public final e:F


# direct methods
.method public constructor <init>(FFFIJ)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput p1, p0, Ls67;->a:F

    .line 33
    iput p2, p0, Ls67;->b:F

    .line 34
    iput-byte p4, p0, Ls67;->c:B

    .line 35
    iput-wide p5, p0, Ls67;->d:J

    const/4 p1, 0x0

    const/high16 p2, 0x3f800000    # 1.0f

    .line 36
    invoke-static {p3, p1, p2}, Lx97;->m(FFF)F

    move-result p1

    iput p1, p0, Ls67;->e:F

    return-void
.end method

.method public constructor <init>(FIJ)V
    .locals 7

    .line 1
    and-int/lit8 p2, p2, 0x4

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :goto_0
    move v2, p2

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :goto_1
    const-wide/16 v0, 0x10

    .line 12
    .line 13
    cmp-long p2, p3, v0

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    :goto_2
    move-wide v5, p3

    .line 18
    goto :goto_3

    .line 19
    :cond_1
    sget-wide p3, Ldw0;->b:J

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :goto_3
    const/high16 v3, 0x3f800000    # 1.0f

    .line 23
    .line 24
    const/4 v4, 0x3

    .line 25
    move-object v0, p0

    .line 26
    move v1, p1

    .line 27
    invoke-direct/range {v0 .. v6}, Ls67;-><init>(FFFIJ)V

    .line 28
    .line 29
    .line 30
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
    instance-of v0, p1, Ls67;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Ls67;

    .line 10
    .line 11
    iget v0, p1, Ls67;->a:F

    .line 12
    .line 13
    iget v1, p0, Ls67;->a:F

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkt1;->b(FF)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget v0, p0, Ls67;->b:F

    .line 23
    .line 24
    iget v1, p1, Ls67;->b:F

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkt1;->b(FF)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget v0, p0, Ls67;->e:F

    .line 34
    .line 35
    iget v1, p1, Ls67;->e:F

    .line 36
    .line 37
    cmpg-float v0, v0, v1

    .line 38
    .line 39
    if-nez v0, :cond_5

    .line 40
    .line 41
    iget-byte v0, p0, Ls67;->c:B

    .line 42
    .line 43
    iget-byte v1, p1, Ls67;->c:B

    .line 44
    .line 45
    if-ne v0, v1, :cond_5

    .line 46
    .line 47
    iget-wide v0, p1, Ls67;->d:J

    .line 48
    .line 49
    sget p1, Ldw0;->h:I

    .line 50
    .line 51
    iget-wide p0, p0, Ls67;->d:J

    .line 52
    .line 53
    invoke-static {p0, p1, v0, v1}, Ltk8;->a(JJ)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 63
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Ls67;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

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
    iget v2, p0, Ls67;->b:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lpc6;->d(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Ls67;->e:F

    .line 23
    .line 24
    invoke-static {v0, v2, v1}, Lpc6;->d(IFI)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-byte v2, p0, Ls67;->c:B

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Loi0;->e(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget v2, Ldw0;->h:I

    .line 35
    .line 36
    iget-wide v2, p0, Ls67;->d:J

    .line 37
    .line 38
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget v0, p0, Ls67;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Lkt1;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Ls67;->b:F

    .line 8
    .line 9
    invoke-static {v1}, Lkt1;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    invoke-static {v2, v3}, Lmt1;->a(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-byte v3, p0, Ls67;->c:B

    .line 20
    .line 21
    invoke-static {v3}, Loc;->F(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-wide v4, p0, Ls67;->d:J

    .line 26
    .line 27
    invoke-static {v4, v5}, Ldw0;->h(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const-string v5, ", spread="

    .line 32
    .line 33
    const-string v6, ", offset="

    .line 34
    .line 35
    const-string v7, "Shadow(radius="

    .line 36
    .line 37
    invoke-static {v7, v0, v5, v1, v6}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", alpha="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget p0, p0, Ls67;->e:F

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, ", blendMode="

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p0, ", color="

    .line 60
    .line 61
    const-string v1, ", brush=null)"

    .line 62
    .line 63
    invoke-static {v0, v3, p0, v4, v1}, Loi0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method
