.class public abstract Ll74;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Le74;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v5, Lk74;

    .line 2
    .line 3
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lb02;->X:Lb02;

    .line 7
    .line 8
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 9
    .line 10
    .line 11
    move-result-object v8

    .line 12
    invoke-static {}, Li21;->b()Lii1;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    const/4 v0, 0x0

    .line 17
    const/16 v1, 0xf

    .line 18
    .line 19
    invoke-static {v0, v0, v0, v0, v1}, Ls31;->b(IIIII)J

    .line 20
    .line 21
    .line 22
    move-result-wide v10

    .line 23
    new-instance v0, Le74;

    .line 24
    .line 25
    const/16 v18, 0x0

    .line 26
    .line 27
    const/16 v19, 0x0

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    sget-object v13, Ld02;->X:Ld02;

    .line 37
    .line 38
    const/4 v14, 0x0

    .line 39
    const/4 v15, 0x0

    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    sget-object v17, Lsd5;->X:Lsd5;

    .line 43
    .line 44
    invoke-direct/range {v0 .. v19}, Le74;-><init>(Lf74;IZFLyr4;FZLb71;Lfi1;JILjava/util/List;IIILsd5;II)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Ll74;->a:Le74;

    .line 48
    .line 49
    return-void
.end method

.method public static final a(Llp2;)Lj74;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sget-object v2, Lj74;->A0:Lxd6;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Llp2;->d(I)Z

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    invoke-virtual {p0, v0}, Llp2;->d(I)Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    or-int/2addr v3, v4

    .line 15
    invoke-virtual {p0}, Llp2;->K()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    sget-object v3, Lzz0;->a:Lbe;

    .line 22
    .line 23
    if-ne v4, v3, :cond_1

    .line 24
    .line 25
    :cond_0
    new-instance v4, Lei3;

    .line 26
    .line 27
    const/16 v3, 0xd

    .line 28
    .line 29
    invoke-direct {v4, v3}, Lei3;-><init>(B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    check-cast v4, Ldn2;

    .line 36
    .line 37
    invoke-static {v1, v2, v4, p0, v0}, Ljm4;->Y([Ljava/lang/Object;Lbw6;Ldn2;Llp2;I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lj74;

    .line 42
    .line 43
    return-object p0
.end method
