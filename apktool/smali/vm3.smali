.class public abstract Lvm3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final d:Lum3;


# instance fields
.field public final a:Lmn3;

.field public final b:Lg55;

.field public final c:Lyr2;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lum3;

    .line 2
    .line 3
    new-instance v1, Lmn3;

    .line 4
    .line 5
    sget-object v8, Lps0;->Z:Lps0;

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const-string v5, "    "

    .line 12
    .line 13
    const-string v6, "type"

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    invoke-direct/range {v1 .. v9}, Lmn3;-><init>(ZZZLjava/lang/String;Ljava/lang/String;ZLps0;Z)V

    .line 17
    .line 18
    .line 19
    sget-object v2, Lv37;->a:Lg55;

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, Lvm3;-><init>(Lmn3;Lg55;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lvm3;->d:Lum3;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lmn3;Lg55;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvm3;->a:Lmn3;

    .line 5
    .line 6
    iput-object p2, p0, Lvm3;->b:Lg55;

    .line 7
    .line 8
    new-instance p1, Lyr2;

    .line 9
    .line 10
    const/16 p2, 0x19

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lyr2;-><init>(B)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lvm3;->c:Lyr2;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Low3;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p2}, Lz68;->f(Lvm3;Ljava/lang/String;)Ld7;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v0, Lnl7;

    .line 12
    .line 13
    invoke-interface {p1}, Low3;->d()Le37;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const/4 v5, 0x0

    .line 18
    sget-object v2, Lq59;->Z:Lq59;

    .line 19
    .line 20
    move-object v1, p0

    .line 21
    invoke-direct/range {v0 .. v5}, Lnl7;-><init>(Lvm3;Lq59;Ld7;Le37;Ljh0;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lnl7;->a(Low3;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v3}, Ld7;->g()B

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/16 p2, 0xa

    .line 33
    .line 34
    if-ne p1, p2, :cond_0

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string p1, "Expected EOF after parsing, but had "

    .line 40
    .line 41
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v3, Ld7;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    iget p2, v3, Ld7;->b:I

    .line 49
    .line 50
    add-int/lit8 p2, p2, -0x1

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p1, " instead"

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const/4 p1, 0x0

    .line 69
    const/4 p2, 0x6

    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-static {v3, p0, p1, v0, p2}, Ld7;->s(Ld7;Ljava/lang/String;ILjava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    throw v0
.end method

.method public final b(Low3;Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb8;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-direct {v0, v1}, Lb8;-><init>(B)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lxp0;->c:Lxp0;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    iget-object v2, v1, Lxp0;->a:Lkt;

    .line 14
    .line 15
    invoke-virtual {v2}, Lkt;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    move-object v2, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v2}, Lkt;->removeLast()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    check-cast v2, [C

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iget v3, v1, Lxp0;->b:I

    .line 33
    .line 34
    array-length v4, v2

    .line 35
    sub-int/2addr v3, v4

    .line 36
    iput v3, v1, Lxp0;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    move-object v4, v2

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    monitor-exit v1

    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    const/16 v1, 0x80

    .line 46
    .line 47
    new-array v4, v1, [C

    .line 48
    .line 49
    :cond_2
    iput-object v4, v0, Lb8;->c:Ljava/lang/Object;

    .line 50
    .line 51
    :try_start_1
    new-instance v1, Lol7;

    .line 52
    .line 53
    sget-object v2, Lq59;->Z:Lq59;

    .line 54
    .line 55
    sget-object v3, Lq59;->j0:Ln22;

    .line 56
    .line 57
    invoke-virtual {v3}, Ln22;->a()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    new-array v3, v3, [Lol7;

    .line 62
    .line 63
    new-instance v4, Lh70;

    .line 64
    .line 65
    invoke-direct {v4, v0}, Lh70;-><init>(Lb8;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v1, v4, p0, v2, v3}, Lol7;-><init>(Lh70;Lvm3;Lq59;[Lol7;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p1, p2}, Lol7;->r(Low3;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lb8;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    invoke-virtual {v0}, Lb8;->k()V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :catchall_1
    move-exception p0

    .line 83
    invoke-virtual {v0}, Lb8;->k()V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :goto_2
    monitor-exit v1

    .line 88
    throw p0
.end method
