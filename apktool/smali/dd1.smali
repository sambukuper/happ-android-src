.class public final Ldd1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrj2;


# instance fields
.field public final a:Ld0;

.field public final b:I

.field public final c:I

.field public final d:Ljava/util/List;


# direct methods
.method public constructor <init>(Ld0;IILjava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldd1;->a:Ld0;

    .line 5
    .line 6
    iput p2, p0, Ldd1;->b:I

    .line 7
    .line 8
    iput p3, p0, Ldd1;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Ldd1;->d:Ljava/util/List;

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    const/4 p1, 0x0

    .line 14
    if-gt p0, p2, :cond_1

    .line 15
    .line 16
    const/16 p0, 0xa

    .line 17
    .line 18
    if-ge p2, p0, :cond_1

    .line 19
    .line 20
    if-gt p2, p3, :cond_0

    .line 21
    .line 22
    if-ge p3, p0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, ") is not in range "

    .line 26
    .line 27
    const-string p4, "..9"

    .line 28
    .line 29
    const-string v0, "The maximum number of digits ("

    .line 30
    .line 31
    invoke-static {p3, v0, p2, p0, p4}, Lpc6;->k(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    const-string p0, "The minimum number of digits ("

    .line 40
    .line 41
    const-string p3, ") is not in range 1..9"

    .line 42
    .line 43
    invoke-static {p0, p2, p3}, Lie2;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/StringBuilder;Z)V
    .locals 4

    .line 1
    sget-object p3, Lyn0;->d:[I

    .line 2
    .line 3
    iget-object v0, p0, Ldd1;->a:Ld0;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ld0;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcd1;

    .line 10
    .line 11
    iget v0, p0, Ldd1;->c:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcd1;->a(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    iget v2, p0, Ldd1;->b:I

    .line 19
    .line 20
    add-int/2addr v2, v1

    .line 21
    if-le v0, v2, :cond_0

    .line 22
    .line 23
    add-int/lit8 v2, v1, 0x1

    .line 24
    .line 25
    aget v3, p3, v2

    .line 26
    .line 27
    rem-int v3, p1, v3

    .line 28
    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    move v1, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sub-int v2, v0, v1

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    sub-int/2addr v2, v3

    .line 37
    iget-object p0, p0, Ldd1;->d:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-lt v1, p0, :cond_1

    .line 50
    .line 51
    sub-int/2addr v1, p0

    .line 52
    :cond_1
    sub-int/2addr v0, v1

    .line 53
    aget p0, p3, v1

    .line 54
    .line 55
    div-int/2addr p1, p0

    .line 56
    aget p0, p3, v0

    .line 57
    .line 58
    add-int/2addr p1, p0

    .line 59
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 68
    .line 69
    .line 70
    return-void
.end method
