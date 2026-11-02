.class public final Llg4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lng4;


# instance fields
.field public final a:Lgg4;

.field public final b:Lj2;

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Lj2;

.field public final f:I

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z


# direct methods
.method public constructor <init>(Lgg4;Lj2;I)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Llg4;->a:Lgg4;

    .line 8
    .line 9
    iput-object p2, p0, Llg4;->b:Lj2;

    .line 10
    .line 11
    iput p3, p0, Llg4;->c:I

    .line 12
    .line 13
    invoke-static {p3, p2}, Lwv0;->u0(ILjava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const-string v0, ""

    .line 22
    .line 23
    :cond_0
    iput-object v0, p0, Llg4;->d:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v1, Lhu;

    .line 26
    .line 27
    const/4 v2, 0x6

    .line 28
    invoke-direct {v1, v0, v2}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Luh3;

    .line 32
    .line 33
    const/16 v2, 0x11

    .line 34
    .line 35
    invoke-direct {v0, v2}, Luh3;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lsd2;

    .line 39
    .line 40
    sget-object v3, La37;->X:La37;

    .line 41
    .line 42
    invoke-direct {v2, v1, v0, v3}, Lsd2;-><init>(Lu27;Lgn2;Lgn2;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lmb6;->e0(Lu27;)Lj2;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Llg4;->e:Lj2;

    .line 50
    .line 51
    invoke-virtual {p2}, Lz0;->a()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    iput p2, p0, Llg4;->f:I

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    const/4 v1, 0x1

    .line 59
    if-le p2, v1, :cond_1

    .line 60
    .line 61
    move v2, v1

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move v2, v0

    .line 64
    :goto_0
    iput-boolean v2, p0, Llg4;->g:Z

    .line 65
    .line 66
    if-lez p3, :cond_2

    .line 67
    .line 68
    move v2, v1

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v2, v0

    .line 71
    :goto_1
    iput-boolean v2, p0, Llg4;->h:Z

    .line 72
    .line 73
    sub-int/2addr p2, v1

    .line 74
    if-ge p3, p2, :cond_3

    .line 75
    .line 76
    move p2, v1

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    move p2, v0

    .line 79
    :goto_2
    iput-boolean p2, p0, Llg4;->i:Z

    .line 80
    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    iget-object p1, p1, Lgg4;->a:Ljava/lang/String;

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    const/4 p1, 0x0

    .line 87
    :goto_3
    if-eqz p1, :cond_5

    .line 88
    .line 89
    move v0, v1

    .line 90
    :cond_5
    iput-boolean v0, p0, Llg4;->j:Z

    .line 91
    .line 92
    return-void
.end method

.method public constructor <init>(Lgg4;Lj2;II)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 93
    const-string p2, ""

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    .line 94
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    sget-object p3, Lec7;->Y:Lec7;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    invoke-virtual {p3, p2}, Lec7;->e(Ljava/util/Collection;)Lj2;

    move-result-object p2

    :cond_0
    const/4 p3, 0x0

    .line 98
    invoke-direct {p0, p1, p2, p3}, Llg4;-><init>(Lgg4;Lj2;I)V

    return-void
.end method

.method public static a(Llg4;I)Llg4;
    .locals 2

    .line 1
    iget-object v0, p0, Llg4;->a:Lgg4;

    .line 2
    .line 3
    iget-object p0, p0, Llg4;->b:Lj2;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, Llg4;

    .line 9
    .line 10
    invoke-direct {v1, v0, p0, p1}, Llg4;-><init>(Lgg4;Lj2;I)V

    .line 11
    .line 12
    .line 13
    return-object v1
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
    instance-of v1, p1, Llg4;

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
    check-cast p1, Llg4;

    .line 12
    .line 13
    iget-object v1, p0, Llg4;->a:Lgg4;

    .line 14
    .line 15
    iget-object v3, p1, Llg4;->a:Lgg4;

    .line 16
    .line 17
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Llg4;->b:Lj2;

    .line 25
    .line 26
    iget-object v3, p1, Llg4;->b:Lj2;

    .line 27
    .line 28
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget p0, p0, Llg4;->c:I

    .line 36
    .line 37
    iget p1, p1, Llg4;->c:I

    .line 38
    .line 39
    if-eq p0, p1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Llg4;->a:Lgg4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lgg4;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget-object v1, p0, Llg4;->b:Lj2;

    .line 14
    .line 15
    invoke-virtual {v1}, Lz1;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    mul-int/lit8 v1, v1, 0x1f

    .line 21
    .line 22
    iget p0, p0, Llg4;->c:I

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v1

    .line 29
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Data(source="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Llg4;->a:Lgg4;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", pages="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Llg4;->b:Lj2;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", currentPage="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    iget p0, p0, Llg4;->c:I

    .line 31
    .line 32
    invoke-static {v0, p0, v1}, Loi0;->n(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
