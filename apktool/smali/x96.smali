.class public final Lx96;
.super Ln75;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final c:Lbx5;

.field public final d:I

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Lbx5;Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-direct {p0, v1, p2}, Ln75;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lx96;->c:Lbx5;

    .line 10
    .line 11
    sget-object p1, Lyn0;->d:[I

    .line 12
    .line 13
    aget p1, p1, v0

    .line 14
    .line 15
    iput p1, p0, Lx96;->d:I

    .line 16
    .line 17
    const/16 p2, 0x7d0

    .line 18
    .line 19
    rem-int p1, p2, p1

    .line 20
    .line 21
    iput p1, p0, Lx96;->e:I

    .line 22
    .line 23
    sub-int/2addr p2, p1

    .line 24
    iput p2, p0, Lx96;->f:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;IILjava/lang/Object;)Lo75;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-ge p2, p3, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    mul-int/lit8 v0, v0, 0xa

    .line 9
    .line 10
    add-int/lit8 v1, v1, -0x30

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    add-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget p1, p0, Lx96;->e:I

    .line 17
    .line 18
    iget p2, p0, Lx96;->f:I

    .line 19
    .line 20
    if-lt v0, p1, :cond_1

    .line 21
    .line 22
    :goto_1
    add-int/2addr p2, v0

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    iget p1, p0, Lx96;->d:I

    .line 25
    .line 26
    add-int/2addr p2, p1

    .line 27
    goto :goto_1

    .line 28
    :goto_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p0, p0, Lx96;->c:Lbx5;

    .line 33
    .line 34
    invoke-virtual {p0, p4, p1}, Lbx5;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-nez p0, :cond_2

    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0

    .line 42
    :cond_2
    new-instance p1, Lf4;

    .line 43
    .line 44
    invoke-direct {p1, p0}, Lf4;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object p1
.end method

.method public final b()Ljava/lang/Integer;
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method
