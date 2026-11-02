.class public final Lfn3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Le37;


# static fields
.field public static final b:Lfn3;

.field public static final c:Ljava/lang/String;


# instance fields
.field public final synthetic a:Lnt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lfn3;

    .line 2
    .line 3
    invoke-direct {v0}, Lfn3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfn3;->b:Lfn3;

    .line 7
    .line 8
    const-string v0, "kotlinx.serialization.json.JsonArray"

    .line 9
    .line 10
    sput-object v0, Lfn3;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Leo3;->a:Leo3;

    .line 5
    .line 6
    new-instance v1, Lnt;

    .line 7
    .line 8
    invoke-virtual {v0}, Leo3;->d()Le37;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v0}, Llb4;-><init>(Le37;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lfn3;->a:Lnt;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lfn3;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final d(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lfn3;->a:Lnt;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Llb4;->d(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final e()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final f(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final g(I)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lfn3;->a:Lnt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Llb4;->g(I)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    sget-object p0, Ld02;->X:Ld02;

    .line 7
    .line 8
    return-object p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ld02;->X:Ld02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(I)Le37;
    .locals 0

    .line 1
    iget-object p0, p0, Lfn3;->a:Lnt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Llb4;->h(I)Le37;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lfn3;->a:Lnt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Llb4;->j(I)Z

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public final r()Lnr4;
    .locals 0

    .line 1
    sget-object p0, Lpm7;->N:Lpm7;

    .line 2
    .line 3
    return-object p0
.end method
