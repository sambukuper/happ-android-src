.class public final Lb38;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final j:[C


# instance fields
.field public final a:Lm90;

.field public b:I

.field public c:Ljava/util/ArrayList;

.field public d:Z

.field public e:I

.field public f:[C

.field public g:I

.field public h:Ljava/lang/String;

.field public i:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    sput-object v0, Lb38;->j:[C

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lm90;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb38;->a:Lm90;

    .line 5
    .line 6
    return-void
.end method

.method public static a(II)V
    .locals 3

    .line 1
    int-to-long v0, p0

    .line 2
    int-to-long p0, p1

    .line 3
    add-long/2addr v0, p0

    .line 4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v2, "TextBuffer overrun: size reached ("

    .line 9
    .line 10
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v0, ") exceeds maximum of 2147483647"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p0
.end method


# virtual methods
.method public final b(IILjava/lang/String;)V
    .locals 4

    .line 1
    iget v0, p0, Lb38;->b:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lb38;->h(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lb38;->h:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lb38;->i:[C

    .line 12
    .line 13
    iget-object v0, p0, Lb38;->f:[C

    .line 14
    .line 15
    array-length v1, v0

    .line 16
    iget v2, p0, Lb38;->g:I

    .line 17
    .line 18
    sub-int/2addr v1, v2

    .line 19
    if-lt v1, p2, :cond_1

    .line 20
    .line 21
    add-int v1, p1, p2

    .line 22
    .line 23
    invoke-virtual {p3, p1, v1, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Lb38;->g:I

    .line 27
    .line 28
    add-int/2addr p1, p2

    .line 29
    iput p1, p0, Lb38;->g:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    if-lez v1, :cond_2

    .line 33
    .line 34
    add-int v3, p1, v1

    .line 35
    .line 36
    invoke-virtual {p3, p1, v3, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 37
    .line 38
    .line 39
    sub-int/2addr p2, v1

    .line 40
    move p1, v3

    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lb38;->f()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lb38;->f:[C

    .line 45
    .line 46
    array-length v0, v0

    .line 47
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    add-int v1, p1, v0

    .line 52
    .line 53
    iget-object v2, p0, Lb38;->f:[C

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-virtual {p3, p1, v1, v2, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 57
    .line 58
    .line 59
    iget p1, p0, Lb38;->g:I

    .line 60
    .line 61
    add-int/2addr p1, v0

    .line 62
    iput p1, p0, Lb38;->g:I

    .line 63
    .line 64
    sub-int/2addr p2, v0

    .line 65
    if-gtz p2, :cond_3

    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    move p1, v1

    .line 69
    goto :goto_0
.end method

.method public final c([CII)V
    .locals 3

    .line 1
    iget v0, p0, Lb38;->b:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p3}, Lb38;->h(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lb38;->h:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lb38;->i:[C

    .line 12
    .line 13
    iget-object v0, p0, Lb38;->f:[C

    .line 14
    .line 15
    array-length v1, v0

    .line 16
    iget v2, p0, Lb38;->g:I

    .line 17
    .line 18
    sub-int/2addr v1, v2

    .line 19
    if-lt v1, p3, :cond_1

    .line 20
    .line 21
    invoke-static {p1, p2, v0, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lb38;->g:I

    .line 25
    .line 26
    add-int/2addr p1, p3

    .line 27
    iput p1, p0, Lb38;->g:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    if-lez v1, :cond_2

    .line 31
    .line 32
    invoke-static {p1, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    add-int/2addr p2, v1

    .line 36
    sub-int/2addr p3, v1

    .line 37
    :cond_2
    invoke-virtual {p0}, Lb38;->f()V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lb38;->f:[C

    .line 41
    .line 42
    array-length v0, v0

    .line 43
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v1, p0, Lb38;->f:[C

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    iget v1, p0, Lb38;->g:I

    .line 54
    .line 55
    add-int/2addr v1, v0

    .line 56
    iput v1, p0, Lb38;->g:I

    .line 57
    .line 58
    add-int/2addr p2, v0

    .line 59
    sub-int/2addr p3, v0

    .line 60
    if-gtz p3, :cond_2

    .line 61
    .line 62
    return-void
.end method

.method public final d()[C
    .locals 7

    .line 1
    iget-object v0, p0, Lb38;->i:[C

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    iget-object v1, p0, Lb38;->h:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_3

    .line 14
    :cond_0
    iget v2, p0, Lb38;->b:I

    .line 15
    .line 16
    sget-object v3, Lb38;->j:[C

    .line 17
    .line 18
    if-ltz v2, :cond_1

    .line 19
    .line 20
    :goto_0
    move-object v0, v3

    .line 21
    goto :goto_3

    .line 22
    :cond_1
    const/4 v4, 0x0

    .line 23
    if-ltz v2, :cond_2

    .line 24
    .line 25
    move v0, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    if-eqz v0, :cond_3

    .line 28
    .line 29
    array-length v0, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_3
    if-eqz v1, :cond_4

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    goto :goto_1

    .line 38
    :cond_4
    iget v0, p0, Lb38;->e:I

    .line 39
    .line 40
    iget v1, p0, Lb38;->g:I

    .line 41
    .line 42
    add-int/2addr v0, v1

    .line 43
    :goto_1
    const/4 v1, 0x1

    .line 44
    if-ge v0, v1, :cond_6

    .line 45
    .line 46
    if-ltz v0, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget v0, p0, Lb38;->e:I

    .line 50
    .line 51
    iget p0, p0, Lb38;->g:I

    .line 52
    .line 53
    invoke-static {v0, p0}, Lb38;->a(II)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    throw p0

    .line 58
    :cond_6
    new-array v0, v0, [C

    .line 59
    .line 60
    iget-object v1, p0, Lb38;->c:Ljava/util/ArrayList;

    .line 61
    .line 62
    if-eqz v1, :cond_7

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    move v2, v4

    .line 69
    move v3, v2

    .line 70
    :goto_2
    if-ge v2, v1, :cond_8

    .line 71
    .line 72
    iget-object v5, p0, Lb38;->c:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, [C

    .line 79
    .line 80
    array-length v6, v5

    .line 81
    invoke-static {v5, v4, v0, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    add-int/2addr v3, v6

    .line 85
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_7
    move v3, v4

    .line 89
    :cond_8
    iget-object v1, p0, Lb38;->f:[C

    .line 90
    .line 91
    iget v2, p0, Lb38;->g:I

    .line 92
    .line 93
    invoke-static {v1, v4, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 94
    .line 95
    .line 96
    :goto_3
    iput-object v0, p0, Lb38;->i:[C

    .line 97
    .line 98
    :cond_9
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lb38;->h:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lb38;->i:[C

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lb38;->h:Ljava/lang/String;

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    iget v0, p0, Lb38;->b:I

    .line 18
    .line 19
    const-string v1, ""

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    iput-object v1, p0, Lb38;->h:Ljava/lang/String;

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    iget v0, p0, Lb38;->e:I

    .line 27
    .line 28
    iget v2, p0, Lb38;->g:I

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    iput-object v1, p0, Lb38;->h:Ljava/lang/String;

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_2
    new-instance v0, Ljava/lang/String;

    .line 39
    .line 40
    iget-object v1, p0, Lb38;->f:[C

    .line 41
    .line 42
    invoke-direct {v0, v1, v3, v2}, Ljava/lang/String;-><init>([CII)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lb38;->h:Ljava/lang/String;

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_3
    add-int v1, v0, v2

    .line 49
    .line 50
    if-ltz v1, :cond_5

    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lb38;->c:Ljava/util/ArrayList;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    move v2, v3

    .line 66
    :goto_0
    if-ge v2, v1, :cond_4

    .line 67
    .line 68
    iget-object v4, p0, Lb38;->c:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, [C

    .line 75
    .line 76
    array-length v5, v4

    .line 77
    invoke-virtual {v0, v4, v3, v5}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    iget-object v1, p0, Lb38;->f:[C

    .line 84
    .line 85
    iget v2, p0, Lb38;->g:I

    .line 86
    .line 87
    invoke-virtual {v0, v1, v3, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, Lb38;->h:Ljava/lang/String;

    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_5
    invoke-static {v0, v2}, Lb38;->a(II)V

    .line 98
    .line 99
    .line 100
    const/4 p0, 0x0

    .line 101
    throw p0

    .line 102
    :cond_6
    return-object v0
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lb38;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lb38;->c:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, Lb38;->f:[C

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    iput-boolean v2, p0, Lb38;->d:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget v0, p0, Lb38;->e:I

    .line 21
    .line 22
    array-length v2, v1

    .line 23
    add-int/2addr v0, v2

    .line 24
    iput v0, p0, Lb38;->e:I

    .line 25
    .line 26
    if-ltz v0, :cond_3

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput v0, p0, Lb38;->g:I

    .line 30
    .line 31
    array-length v0, v1

    .line 32
    shr-int/lit8 v1, v0, 0x1

    .line 33
    .line 34
    add-int/2addr v0, v1

    .line 35
    const/16 v1, 0x1f4

    .line 36
    .line 37
    if-ge v0, v1, :cond_1

    .line 38
    .line 39
    :goto_0
    move v0, v1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/high16 v1, 0x10000

    .line 42
    .line 43
    if-le v0, v1, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    :goto_1
    new-array v0, v0, [C

    .line 47
    .line 48
    iput-object v0, p0, Lb38;->f:[C

    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    array-length p0, v1

    .line 52
    sub-int/2addr v0, p0

    .line 53
    array-length p0, v1

    .line 54
    invoke-static {v0, p0}, Lb38;->a(II)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    throw p0
.end method

.method public final g()[C
    .locals 2

    .line 1
    iget-object v0, p0, Lb38;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lb38;->c:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    iput-boolean v1, p0, Lb38;->d:Z

    .line 14
    .line 15
    iget-object v1, p0, Lb38;->f:[C

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lb38;->f:[C

    .line 21
    .line 22
    array-length v0, v0

    .line 23
    iget v1, p0, Lb38;->e:I

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    iput v1, p0, Lb38;->e:I

    .line 27
    .line 28
    if-ltz v1, :cond_3

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iput v1, p0, Lb38;->g:I

    .line 32
    .line 33
    shr-int/lit8 v1, v0, 0x1

    .line 34
    .line 35
    add-int/2addr v0, v1

    .line 36
    const/16 v1, 0x1f4

    .line 37
    .line 38
    if-ge v0, v1, :cond_1

    .line 39
    .line 40
    :goto_0
    move v0, v1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/high16 v1, 0x10000

    .line 43
    .line 44
    if-le v0, v1, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    new-array v0, v0, [C

    .line 48
    .line 49
    iput-object v0, p0, Lb38;->f:[C

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_3
    sub-int/2addr v1, v0

    .line 53
    invoke-static {v1, v0}, Lb38;->a(II)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    throw p0
.end method

.method public final h(I)V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lb38;->b:I

    .line 3
    .line 4
    iget-object v0, p0, Lb38;->f:[C

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    array-length v0, v0

    .line 9
    if-le p1, v0, :cond_5

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lb38;->a:Lm90;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    sget-object v1, Lm90;->d:[I

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    aget v1, v1, v2

    .line 19
    .line 20
    if-ge p1, v1, :cond_1

    .line 21
    .line 22
    move p1, v1

    .line 23
    :cond_1
    iget-object v0, v0, Lm90;->b:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, [C

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    array-length v1, v0

    .line 35
    if-ge v1, p1, :cond_4

    .line 36
    .line 37
    :cond_2
    new-array v0, p1, [C

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    const/16 v0, 0x1f4

    .line 41
    .line 42
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    new-array v0, p1, [C

    .line 47
    .line 48
    :cond_4
    :goto_0
    iput-object v0, p0, Lb38;->f:[C

    .line 49
    .line 50
    :cond_5
    const/4 p1, 0x0

    .line 51
    iput p1, p0, Lb38;->e:I

    .line 52
    .line 53
    iput p1, p0, Lb38;->g:I

    .line 54
    .line 55
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lb38;->e()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    const-string p0, "TextBuffer: Exception when reading contents"

    .line 7
    .line 8
    return-object p0
.end method
