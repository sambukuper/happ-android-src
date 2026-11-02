.class public final Lqo;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqo;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/net/URL;Ljava/lang/String;Lun;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lokhttp3/Request$Builder;
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Ljava/net/URL;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 3
    const-string v1, "Connection"

    invoke-virtual {v0, v1, p8}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p8

    .line 4
    const-string v0, "X-HWID"

    invoke-virtual {p8, v0, p2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p8

    .line 5
    const-string v0, "X-Ver-OS"

    invoke-virtual {p8, v0, p4}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p4

    .line 6
    const-string p8, "X-Bundle-ID"

    const-string v0, "su.happ.proxyutility"

    invoke-virtual {p4, p8, v0}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p4

    .line 7
    const-string p8, "X-Device-model"

    invoke-virtual {p4, p8, p5}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p4

    .line 8
    iget-object p0, p0, Lqo;->a:Landroid/content/Context;

    invoke-static {p0}, Lue3;->y(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "AndroidTV"

    goto :goto_0

    :cond_0
    const-string p0, "Android"

    :goto_0
    const-string p5, "X-Device-OS"

    invoke-virtual {p4, p5, p0}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p0

    .line 9
    const-string p4, "X-API-Version"

    const-string p5, "1.0"

    invoke-virtual {p0, p4, p5}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p0

    .line 10
    sget-object p4, Lej3;->c:Lnp3;

    .line 11
    new-instance p4, Ljava/util/LinkedHashMap;

    invoke-direct {p4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 12
    new-instance p5, Ljava/util/LinkedHashMap;

    invoke-direct {p5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    const-string p8, "hwid"

    .line 14
    invoke-interface {p4, p8, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    const-string p2, "iss"

    .line 16
    invoke-interface {p4, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    iget-object p2, p3, Lun;->X:Ljava/lang/String;

    .line 18
    const-string p3, "sub"

    .line 19
    invoke-interface {p4, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-static {}, Ly08;->c()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 21
    const-string p3, "iat"

    invoke-interface {p4, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    sget-object p2, Lro;->a:Ljava/lang/String;

    .line 23
    sget-object p3, Lro;->b:Ljava/lang/String;

    .line 24
    sget-object p8, Lro;->c:Ljava/lang/String;

    .line 25
    new-instance v0, Lsu/happ/proxyutility/util/ErrorCodeJNIWrapper;

    invoke-direct {v0}, Lsu/happ/proxyutility/util/ErrorCodeJNIWrapper;-><init>()V

    const/16 v1, 0x39

    invoke-virtual {v0, v1}, Lsu/happ/proxyutility/util/ErrorCodeJNIWrapper;->a(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "KCcg+"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 26
    new-instance p3, Lvk1;

    invoke-direct {p3, p2}, Lvk1;-><init>(Ljava/lang/String;)V

    .line 27
    const-string p2, "alg"

    .line 28
    const-string p8, "HS256"

    .line 29
    invoke-interface {p5, p2, p8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    const-string p2, "typ"

    invoke-interface {p5, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p8

    if-nez p8, :cond_1

    .line 31
    const-string p8, "JWT"

    invoke-interface {p5, p2, p8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    :cond_1
    new-instance p2, Lej3;

    .line 33
    invoke-direct {p2, p3, p5, p4}, Lej3;-><init>(Lvk1;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V

    .line 34
    invoke-static {}, Lj$/util/Base64;->getUrlEncoder()Lj$/util/Base64$Encoder;

    move-result-object p4

    invoke-virtual {p4}, Lj$/util/Base64$Encoder;->withoutPadding()Lj$/util/Base64$Encoder;

    move-result-object p4

    sget-object p5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 35
    iget-object p8, p2, Lej3;->a:Ljava/lang/String;

    invoke-virtual {p8, p5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p8

    invoke-virtual {p4, p8}, Lj$/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    move-result-object p4

    .line 36
    invoke-static {}, Lj$/util/Base64;->getUrlEncoder()Lj$/util/Base64$Encoder;

    move-result-object p8

    invoke-virtual {p8}, Lj$/util/Base64$Encoder;->withoutPadding()Lj$/util/Base64$Encoder;

    move-result-object p8

    iget-object p2, p2, Lej3;->b:Ljava/lang/String;

    .line 37
    invoke-virtual {p2, p5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    invoke-virtual {p8, p2}, Lj$/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    move-result-object p2

    .line 38
    invoke-virtual {p4, p5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p8

    .line 39
    invoke-virtual {p2, p5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p5

    .line 40
    :try_start_0
    iget-object v0, p3, Lvk1;->Y:Ljava/lang/Object;

    check-cast v0, [B

    invoke-static {v0, p8, p5}, Lbe;->g([B[B[B)[B

    move-result-object p3
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    invoke-static {}, Lj$/util/Base64;->getUrlEncoder()Lj$/util/Base64$Encoder;

    move-result-object p5

    invoke-virtual {p5}, Lj$/util/Base64$Encoder;->withoutPadding()Lj$/util/Base64$Encoder;

    move-result-object p5

    invoke-virtual {p5, p3}, Lj$/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    move-result-object p3

    .line 42
    const-string p5, "."

    invoke-static {p4, p5, p2, p5, p3}, Lpc6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 43
    const-string p3, "X-Credential"

    invoke-virtual {p0, p3, p2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p0

    .line 44
    const-string p2, "X-App-Version"

    const-string p3, "4.9.0"

    invoke-virtual {p0, p2, p3}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p0

    .line 45
    const-string p2, "X-Sub-Expire"

    invoke-static {p9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p0

    const/4 p2, 0x0

    if-eqz p6, :cond_3

    .line 46
    invoke-virtual {p6}, Ljava/lang/String;->length()I

    move-result p3

    if-lez p3, :cond_2

    goto :goto_1

    :cond_2
    move-object p6, p2

    :goto_1
    if-eqz p6, :cond_3

    .line 47
    const-string p3, "X-Domain-Hash"

    invoke-virtual {p0, p3, p6}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p3

    if-eqz p3, :cond_3

    move-object p0, p3

    :cond_3
    if-eqz p7, :cond_5

    .line 48
    invoke-virtual {p7}, Ljava/lang/String;->length()I

    move-result p3

    if-lez p3, :cond_4

    goto :goto_2

    :cond_4
    move-object p7, p2

    :goto_2
    if-eqz p7, :cond_5

    .line 49
    const-string p2, "X-Provider-ID"

    invoke-virtual {p0, p2, p7}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p2

    if-eqz p2, :cond_5

    move-object p0, p2

    .line 50
    :cond_5
    invoke-virtual {p1}, Ljava/net/URL;->getUserInfo()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 51
    sget-object p2, Lss8;->a:Lss8;

    invoke-static {p1}, Lss8;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lss8;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Basic "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 52
    const-string p2, "Authorization"

    invoke-virtual {p0, p2, p1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    :cond_6
    return-object p0

    :catch_0
    move-exception p0

    goto :goto_3

    :catch_1
    move-exception p0

    .line 53
    :goto_3
    new-instance p1, Le97;

    .line 54
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "The Token\'s Signature couldn\'t be generated when signing using the Algorithm: "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 55
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    throw p1
.end method

.method public final b(IZZ)Lokhttp3/OkHttpClient;
    .locals 3

    .line 1
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    int-to-long v1, p1

    .line 7
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, p1}, Lokhttp3/OkHttpClient$Builder;->callTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, v1, v2, p1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1, v2, p1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v1, v2, p1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1, p3}, Lokhttp3/OkHttpClient$Builder;->retryOnConnectionFailure(Z)Lokhttp3/OkHttpClient$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 p3, 0x0

    .line 30
    invoke-virtual {p1, p3}, Lokhttp3/OkHttpClient$Builder;->cache(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance p3, Lai3;

    .line 35
    .line 36
    iget-object v0, p0, Lqo;->a:Landroid/content/Context;

    .line 37
    .line 38
    invoke-direct {p3, v0}, Lai3;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p3}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance p3, Lsr8;

    .line 46
    .line 47
    new-instance v0, Lo7;

    .line 48
    .line 49
    const/4 v1, 0x6

    .line 50
    invoke-direct {v0, p0, v1}, Lo7;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p3, v0}, Lsr8;-><init>(Ldn2;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p3}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    sget-object p1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 61
    .line 62
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lsu/happ/proxyutility/HappApplication;->e()Lc16;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/16 p3, 0x1b58

    .line 71
    .line 72
    invoke-virtual {p1, p0, p3}, Lc16;->a(Lokhttp3/OkHttpClient$Builder;I)Lokhttp3/OkHttpClient$Builder;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-eqz p2, :cond_0

    .line 77
    .line 78
    new-instance p1, Lrn;

    .line 79
    .line 80
    const/4 p2, 0x0

    .line 81
    invoke-direct {p1, p2}, Lrn;-><init>(B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient$Builder;->hostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;

    .line 85
    .line 86
    .line 87
    :cond_0
    invoke-virtual {p0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public final c(Ltn;Ljava/lang/String;Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v1, p4, Lvn;

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    move-object v1, p4

    .line 6
    check-cast v1, Lvn;

    .line 7
    .line 8
    iget v2, v1, Lvn;->h0:I

    .line 9
    .line 10
    const/high16 v3, -0x80000000

    .line 11
    .line 12
    and-int v4, v2, v3

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    sub-int/2addr v2, v3

    .line 17
    iput v2, v1, Lvn;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Lvn;

    .line 21
    .line 22
    invoke-direct {v1, p0, p4}, Lvn;-><init>(Lqo;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v0, v1, Lvn;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v2, v1, Lvn;->h0:I

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v10, 0x1

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    if-ne v2, v10, :cond_1

    .line 34
    .line 35
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v3

    .line 45
    :cond_2
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    if-eq v0, v10, :cond_4

    .line 55
    .line 56
    const/4 v2, 0x2

    .line 57
    if-ne v0, v2, :cond_3

    .line 58
    .line 59
    new-instance v2, Lvb;

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x3

    .line 63
    const/4 v3, 0x3

    .line 64
    const-class v5, Lqo;

    .line 65
    .line 66
    const-string v6, "checkInstallIdCheckHapp"

    .line 67
    .line 68
    const-string v7, "checkInstallIdCheckHapp-qH93ujY(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 69
    .line 70
    move-object v4, p0

    .line 71
    invoke-direct/range {v2 .. v9}, Lvb;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 76
    .line 77
    .line 78
    return-object v3

    .line 79
    :cond_4
    new-instance v2, Lvb;

    .line 80
    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v9, 0x2

    .line 83
    const/4 v3, 0x3

    .line 84
    const-class v5, Lqo;

    .line 85
    .line 86
    const-string v6, "checkInstallIdQLimited"

    .line 87
    .line 88
    const-string v7, "checkInstallIdQLimited-qH93ujY(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 89
    .line 90
    move-object v4, p0

    .line 91
    invoke-direct/range {v2 .. v9}, Lvb;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    new-instance v2, Lvb;

    .line 96
    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v9, 0x1

    .line 99
    const/4 v3, 0x3

    .line 100
    const-class v5, Lqo;

    .line 101
    .line 102
    const-string v6, "checkInstallIdCheckHapp"

    .line 103
    .line 104
    const-string v7, "checkInstallIdCheckHapp-qH93ujY(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 105
    .line 106
    move-object v4, p0

    .line 107
    invoke-direct/range {v2 .. v9}, Lvb;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 108
    .line 109
    .line 110
    :goto_1
    new-instance v0, Lsu/happ/proxyutility/dto/InstallId;

    .line 111
    .line 112
    invoke-direct {v0, p2}, Lsu/happ/proxyutility/dto/InstallId;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    new-instance v3, Lsu/happ/proxyutility/dto/HashedDomain;

    .line 116
    .line 117
    invoke-direct {v3, p3}, Lsu/happ/proxyutility/dto/HashedDomain;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iput v10, v1, Lvn;->h0:I

    .line 121
    .line 122
    invoke-interface {v2, v0, v3, v1}, Lsn2;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sget-object v1, Lc71;->X:Lc71;

    .line 127
    .line 128
    if-ne v0, v1, :cond_6

    .line 129
    .line 130
    return-object v1

    .line 131
    :cond_6
    :goto_2
    check-cast v0, Lsj6;

    .line 132
    .line 133
    iget-object v0, v0, Lsj6;->X:Ljava/lang/Object;

    .line 134
    .line 135
    return-object v0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lzn;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lzn;

    .line 7
    .line 8
    iget v1, v0, Lzn;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lzn;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzn;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lzn;-><init>(Lqo;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lzn;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lzn;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v3

    .line 45
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p3, Lao;

    .line 49
    .line 50
    invoke-direct {p3, p1, p0, p2, v3}, Lao;-><init>(Ljava/lang/String;Lqo;Ljava/lang/String;Lq51;)V

    .line 51
    .line 52
    .line 53
    new-instance p0, Lj31;

    .line 54
    .line 55
    const/4 p1, 0x7

    .line 56
    invoke-direct {p0, p3, p1}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    sget-object p1, Ltp1;->a:Lnf1;

    .line 60
    .line 61
    sget-object p1, Lye1;->Z:Lye1;

    .line 62
    .line 63
    invoke-static {p0, p1}, Lzc1;->H(Lxe2;Ls61;)Lxe2;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance p1, Lq5;

    .line 68
    .line 69
    const/4 p2, 0x2

    .line 70
    invoke-direct {p1, p2, v3, p2}, Lq5;-><init>(ILq51;B)V

    .line 71
    .line 72
    .line 73
    iput v2, v0, Lzn;->h0:I

    .line 74
    .line 75
    invoke-static {p0, p1, v0}, Lgv3;->s(Lxe2;Lq5;Ls51;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    sget-object p0, Lc71;->X:Lc71;

    .line 80
    .line 81
    if-ne p3, p0, :cond_3

    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_3
    :goto_1
    check-cast p3, Lsj6;

    .line 85
    .line 86
    if-eqz p3, :cond_4

    .line 87
    .line 88
    iget-object p0, p3, Lsj6;->X:Ljava/lang/Object;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_4
    new-instance p0, Ljava/lang/Exception;

    .line 92
    .line 93
    const-string p1, "Maximum tries exceeded"

    .line 94
    .line 95
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, Lrj6;

    .line 99
    .line 100
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    return-object p1
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lbo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lbo;

    .line 7
    .line 8
    iget v1, v0, Lbo;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lbo;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lbo;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lbo;-><init>(Lqo;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lbo;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lbo;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v3

    .line 45
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p3, Ltp1;->a:Lnf1;

    .line 49
    .line 50
    sget-object p3, Lye1;->Z:Lye1;

    .line 51
    .line 52
    new-instance v1, Lco;

    .line 53
    .line 54
    invoke-direct {v1, p1, p0, p2, v3}, Lco;-><init>(Ljava/lang/String;Lqo;Ljava/lang/String;Lq51;)V

    .line 55
    .line 56
    .line 57
    iput v2, v0, Lbo;->h0:I

    .line 58
    .line 59
    invoke-static {p3, v1, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    sget-object p0, Lc71;->X:Lc71;

    .line 64
    .line 65
    if-ne p3, p0, :cond_3

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_3
    :goto_1
    check-cast p3, Lsj6;

    .line 69
    .line 70
    iget-object p0, p3, Lsj6;->X:Ljava/lang/Object;

    .line 71
    .line 72
    return-object p0
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Ltn;Ljava/lang/Long;Ls51;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p5, Leo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Leo;

    .line 7
    .line 8
    iget v1, v0, Leo;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Leo;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Leo;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Leo;-><init>(Lqo;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Leo;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Leo;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p5}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p5, Ltp1;->a:Lnf1;

    .line 49
    .line 50
    sget-object p5, Lye1;->Z:Lye1;

    .line 51
    .line 52
    new-instance v3, Lfo;

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    move-object v6, p0

    .line 56
    move-object v5, p1

    .line 57
    move-object v7, p2

    .line 58
    move-object v4, p3

    .line 59
    move-object v8, p4

    .line 60
    invoke-direct/range {v3 .. v9}, Lfo;-><init>(Ltn;Ljava/lang/String;Lqo;Ljava/lang/String;Ljava/lang/Long;Lq51;)V

    .line 61
    .line 62
    .line 63
    iput v2, v0, Leo;->h0:I

    .line 64
    .line 65
    invoke-static {p5, v3, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p5

    .line 69
    sget-object p0, Lc71;->X:Lc71;

    .line 70
    .line 71
    if-ne p5, p0, :cond_3

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_3
    :goto_1
    check-cast p5, Lsj6;

    .line 75
    .line 76
    iget-object p0, p5, Lsj6;->X:Ljava/lang/Object;

    .line 77
    .line 78
    return-object p0
.end method

.method public final g(Ltn;Lsu/happ/proxyutility/dto/SubscriptionItem;Ls51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lgo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lgo;

    .line 7
    .line 8
    iget v1, v0, Lgo;->k0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lgo;->k0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lgo;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lgo;-><init>(Lqo;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lgo;->i0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lgo;->k0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lgo;->h0:Ljava/lang/String;

    .line 36
    .line 37
    iget-object p2, v0, Lgo;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 38
    .line 39
    iget-object p1, v0, Lgo;->f0:Ltn;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    check-cast p3, Lsj6;

    .line 45
    .line 46
    iget-object p3, p3, Lsj6;->X:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :try_start_1
    sget-object p3, Lss8;->a:Lss8;

    .line 62
    .line 63
    invoke-static {p2}, Lss8;->q(Lsu/happ/proxyutility/dto/SubscriptionItem;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    check-cast p3, Lsu/happ/proxyutility/dto/HashedDomain;

    .line 71
    .line 72
    invoke-virtual {p3}, Lsu/happ/proxyutility/dto/HashedDomain;->c()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->M()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 80
    if-eqz v1, :cond_a

    .line 81
    .line 82
    :try_start_2
    iput-object p1, v0, Lgo;->f0:Ltn;

    .line 83
    .line 84
    iput-object p2, v0, Lgo;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 85
    .line 86
    iput-object p3, v0, Lgo;->h0:Ljava/lang/String;

    .line 87
    .line 88
    iput v2, v0, Lgo;->k0:I

    .line 89
    .line 90
    invoke-virtual {p0, p1, v1, p3, v0}, Lqo;->c(Ltn;Ljava/lang/String;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 94
    sget-object v0, Lc71;->X:Lc71;

    .line 95
    .line 96
    if-ne p0, v0, :cond_3

    .line 97
    .line 98
    return-object v0

    .line 99
    :cond_3
    move-object v5, p3

    .line 100
    move-object p3, p0

    .line 101
    move-object p0, v5

    .line 102
    :goto_1
    :try_start_3
    instance-of v0, p3, Lrj6;

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    move-object v0, v3

    .line 107
    goto :goto_2

    .line 108
    :cond_4
    move-object v0, p3

    .line 109
    :goto_2
    check-cast v0, Lqg5;

    .line 110
    .line 111
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 112
    .line 113
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    new-instance v2, Lsn;

    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    invoke-direct {v2, p2, p1, v0, v4}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v2}, Lkf4;->h(Lgn2;)V

    .line 128
    .line 129
    .line 130
    instance-of p1, p3, Lrj6;

    .line 131
    .line 132
    if-nez p1, :cond_6

    .line 133
    .line 134
    check-cast p3, Lqg5;

    .line 135
    .line 136
    iget-object p1, p3, Lqg5;->X:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p1, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    iget-object p2, p3, Lqg5;->Y:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p2, Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;

    .line 147
    .line 148
    const/16 p3, 0xc8

    .line 149
    .line 150
    if-gt p3, p1, :cond_5

    .line 151
    .line 152
    const/16 p3, 0x12c

    .line 153
    .line 154
    if-ge p1, p3, :cond_5

    .line 155
    .line 156
    move-object p3, p2

    .line 157
    goto :goto_3

    .line 158
    :cond_5
    move-object p3, v3

    .line 159
    :cond_6
    :goto_3
    instance-of p1, p3, Lrj6;

    .line 160
    .line 161
    if-eqz p1, :cond_7

    .line 162
    .line 163
    move-object p3, v3

    .line 164
    :cond_7
    check-cast p3, Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;

    .line 165
    .line 166
    sget-object p1, Lsu/happ/proxyutility/dto/enums/TypeCheck;->REST:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 167
    .line 168
    new-instance p2, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 169
    .line 170
    invoke-direct {p2, p0, p3, p1}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;Lsu/happ/proxyutility/dto/enums/TypeCheck;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 171
    .line 172
    .line 173
    :goto_4
    move-object p3, p0

    .line 174
    goto :goto_6

    .line 175
    :catchall_1
    move-exception p1

    .line 176
    move-object p0, p3

    .line 177
    :goto_5
    :try_start_4
    instance-of p2, p1, Ljava/lang/InterruptedException;

    .line 178
    .line 179
    if-nez p2, :cond_9

    .line 180
    .line 181
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    .line 182
    .line 183
    if-nez p2, :cond_9

    .line 184
    .line 185
    new-instance p2, Lrj6;

    .line 186
    .line 187
    invoke-direct {p2, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :goto_6
    :try_start_5
    instance-of p0, p2, Lrj6;

    .line 192
    .line 193
    if-eqz p0, :cond_8

    .line 194
    .line 195
    move-object p2, v3

    .line 196
    :cond_8
    check-cast p2, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 197
    .line 198
    if-nez p2, :cond_b

    .line 199
    .line 200
    goto :goto_8

    .line 201
    :catchall_2
    move-exception p0

    .line 202
    goto :goto_9

    .line 203
    :catchall_3
    move-exception p0

    .line 204
    goto :goto_7

    .line 205
    :cond_9
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 206
    :goto_7
    :try_start_7
    throw p0

    .line 207
    :cond_a
    :goto_8
    new-instance p2, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 208
    .line 209
    sget-object p0, Lsu/happ/proxyutility/dto/enums/TypeCheck;->REST:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 210
    .line 211
    const/4 p1, 0x2

    .line 212
    invoke-direct {p2, p3, p0, p1}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 213
    .line 214
    .line 215
    goto :goto_a

    .line 216
    :goto_9
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 217
    .line 218
    if-nez p1, :cond_d

    .line 219
    .line 220
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 221
    .line 222
    if-nez p1, :cond_d

    .line 223
    .line 224
    new-instance p2, Lrj6;

    .line 225
    .line 226
    invoke-direct {p2, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    :cond_b
    :goto_a
    invoke-static {p2}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    if-nez p0, :cond_c

    .line 234
    .line 235
    check-cast p2, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 236
    .line 237
    goto :goto_b

    .line 238
    :cond_c
    new-instance p2, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 239
    .line 240
    sget-object p0, Lsu/happ/proxyutility/dto/enums/TypeCheck;->REST:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 241
    .line 242
    const/4 p1, 0x3

    .line 243
    invoke-direct {p2, v3, p0, p1}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 244
    .line 245
    .line 246
    :goto_b
    return-object p2

    .line 247
    :cond_d
    throw p0
.end method

.method public final h(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lho;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lho;

    .line 7
    .line 8
    iget v1, v0, Lho;->j0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lho;->j0:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lho;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, Lho;-><init>(Lqo;Ls51;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v6, Lho;->h0:Ljava/lang/Object;

    .line 28
    .line 29
    iget v0, v6, Lho;->j0:I

    .line 30
    .line 31
    const/4 v7, 0x3

    .line 32
    const/4 v1, 0x1

    .line 33
    const/4 v8, 0x0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-ne v0, v1, :cond_1

    .line 37
    .line 38
    iget-object p0, v6, Lho;->g0:Ljava/lang/String;

    .line 39
    .line 40
    iget-object p1, v6, Lho;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    check-cast p3, Lsj6;

    .line 46
    .line 47
    iget-object p2, p3, Lsj6;->X:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object p0, v0

    .line 53
    goto/16 :goto_9

    .line 54
    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v8

    .line 61
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :try_start_1
    sget-object p3, Lss8;->a:Lss8;

    .line 65
    .line 66
    invoke-static {p1}, Lss8;->q(Lsu/happ/proxyutility/dto/SubscriptionItem;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    check-cast p3, Lsu/happ/proxyutility/dto/HashedDomain;

    .line 74
    .line 75
    invoke-virtual {p3}, Lsu/happ/proxyutility/dto/HashedDomain;->c()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-nez p2, :cond_3

    .line 80
    .line 81
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    :cond_3
    move-object v2, p2

    .line 86
    if-eqz v2, :cond_c

    .line 87
    .line 88
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-eqz p2, :cond_5

    .line 93
    .line 94
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/MetaParams;->F()Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    if-eqz p3, :cond_4

    .line 99
    .line 100
    new-instance v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;

    .line 101
    .line 102
    invoke-direct {v0, p3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;-><init>(Ljava/util/Map;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    move-object v0, v8

    .line 107
    :goto_2
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/MetaParams;->A0()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/MetaParams;->P()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/MetaParams;->U()Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    filled-new-array {v0, p3, v4, p2}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-static {p2}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    xor-int/2addr p2, v1

    .line 132
    if-ne p2, v1, :cond_5

    .line 133
    .line 134
    sget-object p2, Ltn;->Z:Ltn;

    .line 135
    .line 136
    :goto_3
    move-object v4, p2

    .line 137
    goto :goto_4

    .line 138
    :cond_5
    sget-object p2, Ltn;->Y:Ltn;

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :goto_4
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    if-eqz p2, :cond_6

    .line 146
    .line 147
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/MetaParams;->Z0()Lsu/happ/proxyutility/dto/SubscriptionUserInfo;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    if-eqz p2, :cond_6

    .line 152
    .line 153
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/SubscriptionUserInfo;->d()J

    .line 154
    .line 155
    .line 156
    move-result-wide p2

    .line 157
    new-instance v0, Ljava/lang/Long;

    .line 158
    .line 159
    invoke-direct {v0, p2, p3}, Ljava/lang/Long;-><init>(J)V

    .line 160
    .line 161
    .line 162
    move-object v5, v0

    .line 163
    goto :goto_5

    .line 164
    :cond_6
    move-object v5, v8

    .line 165
    :goto_5
    iput-object p1, v6, Lho;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 166
    .line 167
    iput-object v3, v6, Lho;->g0:Ljava/lang/String;

    .line 168
    .line 169
    iput v1, v6, Lho;->j0:I

    .line 170
    .line 171
    move-object v1, p0

    .line 172
    invoke-virtual/range {v1 .. v6}, Lqo;->f(Ljava/lang/String;Ljava/lang/String;Ltn;Ljava/lang/Long;Ls51;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    sget-object p0, Lc71;->X:Lc71;

    .line 177
    .line 178
    if-ne p2, p0, :cond_7

    .line 179
    .line 180
    return-object p0

    .line 181
    :cond_7
    move-object p0, v3

    .line 182
    :goto_6
    :try_start_2
    instance-of p3, p2, Lrj6;

    .line 183
    .line 184
    if-eqz p3, :cond_8

    .line 185
    .line 186
    move-object p3, v8

    .line 187
    goto :goto_7

    .line 188
    :cond_8
    move-object p3, p2

    .line 189
    :goto_7
    check-cast p3, Lqg5;

    .line 190
    .line 191
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 192
    .line 193
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    new-instance v1, Lp0;

    .line 202
    .line 203
    const/4 v2, 0x4

    .line 204
    invoke-direct {v1, p1, p3, v2}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v1}, Lkf4;->h(Lgn2;)V

    .line 208
    .line 209
    .line 210
    instance-of p1, p2, Lrj6;

    .line 211
    .line 212
    if-nez p1, :cond_a

    .line 213
    .line 214
    check-cast p2, Lqg5;

    .line 215
    .line 216
    iget-object p1, p2, Lqg5;->Y:Ljava/lang/Object;

    .line 217
    .line 218
    move-object p3, p1

    .line 219
    check-cast p3, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 220
    .line 221
    iget-object p2, p2, Lqg5;->X:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p2, Ljava/lang/Number;

    .line 224
    .line 225
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    const/16 p3, 0xc8

    .line 230
    .line 231
    if-gt p3, p2, :cond_9

    .line 232
    .line 233
    const/16 p3, 0x12c

    .line 234
    .line 235
    if-ge p2, p3, :cond_9

    .line 236
    .line 237
    goto :goto_8

    .line 238
    :cond_9
    move-object p1, v8

    .line 239
    :goto_8
    move-object p2, p1

    .line 240
    check-cast p2, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 241
    .line 242
    :cond_a
    instance-of p1, p2, Lrj6;

    .line 243
    .line 244
    if-eqz p1, :cond_b

    .line 245
    .line 246
    move-object p2, v8

    .line 247
    :cond_b
    check-cast p2, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 248
    .line 249
    sget-object p1, Lsu/happ/proxyutility/dto/enums/TypeCheck;->REST:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 250
    .line 251
    new-instance p3, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 252
    .line 253
    invoke-direct {p3, p0, p2, p1}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;Lsu/happ/proxyutility/dto/enums/TypeCheck;)V

    .line 254
    .line 255
    .line 256
    goto :goto_a

    .line 257
    :cond_c
    new-instance p3, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 258
    .line 259
    sget-object p0, Lsu/happ/proxyutility/dto/enums/TypeCheck;->REST:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 260
    .line 261
    invoke-direct {p3, v8, p0, v7}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 262
    .line 263
    .line 264
    goto :goto_a

    .line 265
    :goto_9
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 266
    .line 267
    if-nez p1, :cond_e

    .line 268
    .line 269
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 270
    .line 271
    if-nez p1, :cond_e

    .line 272
    .line 273
    new-instance p3, Lrj6;

    .line 274
    .line 275
    invoke-direct {p3, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    :goto_a
    invoke-static {p3}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    if-nez p0, :cond_d

    .line 283
    .line 284
    check-cast p3, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 285
    .line 286
    goto :goto_b

    .line 287
    :cond_d
    new-instance p3, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 288
    .line 289
    sget-object p0, Lsu/happ/proxyutility/dto/enums/TypeCheck;->REST:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 290
    .line 291
    invoke-direct {p3, v8, p0, v7}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 292
    .line 293
    .line 294
    :goto_b
    return-object p3

    .line 295
    :cond_e
    throw p0
.end method

.method public final i(Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lio;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio;

    .line 7
    .line 8
    iget v1, v0, Lio;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lio;-><init>(Lqo;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lio;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p2, Ltp1;->a:Lnf1;

    .line 49
    .line 50
    sget-object p2, Lye1;->Z:Lye1;

    .line 51
    .line 52
    new-instance v1, Ljo;

    .line 53
    .line 54
    invoke-direct {v1, p0, p1, v2}, Ljo;-><init>(Lqo;Ljava/lang/String;Lq51;)V

    .line 55
    .line 56
    .line 57
    iput v3, v0, Lio;->h0:I

    .line 58
    .line 59
    invoke-static {p2, v1, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    sget-object p0, Lc71;->X:Lc71;

    .line 64
    .line 65
    if-ne p2, p0, :cond_3

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_3
    :goto_1
    check-cast p2, Lsj6;

    .line 69
    .line 70
    iget-object p0, p2, Lsj6;->X:Ljava/lang/Object;

    .line 71
    .line 72
    return-object p0
.end method

.method public final j(Ljava/lang/String;Ljava/util/ArrayList;ILs51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, Lko;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lko;

    .line 7
    .line 8
    iget v1, v0, Lko;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lko;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lko;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lko;-><init>(Lqo;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lko;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lko;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p4, Ltp1;->a:Lnf1;

    .line 49
    .line 50
    sget-object p4, Lye1;->Z:Lye1;

    .line 51
    .line 52
    new-instance v3, Llo;

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    move-object v6, p0

    .line 56
    move-object v4, p1

    .line 57
    move-object v5, p2

    .line 58
    move v7, p3

    .line 59
    invoke-direct/range {v3 .. v8}, Llo;-><init>(Ljava/lang/String;Ljava/util/List;Lqo;ILq51;)V

    .line 60
    .line 61
    .line 62
    iput v2, v0, Lko;->h0:I

    .line 63
    .line 64
    invoke-static {p4, v3, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p4

    .line 68
    sget-object p0, Lc71;->X:Lc71;

    .line 69
    .line 70
    if-ne p4, p0, :cond_3

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_3
    :goto_1
    check-cast p4, Lsj6;

    .line 74
    .line 75
    iget-object p0, p4, Lsj6;->X:Ljava/lang/Object;

    .line 76
    .line 77
    return-object p0
.end method

.method public final k(Ljava/io/File;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lmo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lmo;

    .line 7
    .line 8
    iget v1, v0, Lmo;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lmo;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lmo;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lmo;-><init>(Lqo;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lmo;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lmo;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p2, Ltp1;->a:Lnf1;

    .line 49
    .line 50
    sget-object p2, Lye1;->Z:Lye1;

    .line 51
    .line 52
    new-instance v1, Lno;

    .line 53
    .line 54
    invoke-direct {v1, p0, p1, v2}, Lno;-><init>(Lqo;Ljava/io/File;Lq51;)V

    .line 55
    .line 56
    .line 57
    iput v3, v0, Lmo;->h0:I

    .line 58
    .line 59
    invoke-static {p2, v1, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    sget-object p0, Lc71;->X:Lc71;

    .line 64
    .line 65
    if-ne p2, p0, :cond_3

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_3
    :goto_1
    check-cast p2, Lsj6;

    .line 69
    .line 70
    iget-object p0, p2, Lsj6;->X:Ljava/lang/Object;

    .line 71
    .line 72
    return-object p0
.end method

.method public final l(Ljava/lang/String;[Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Loo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Loo;

    .line 7
    .line 8
    iget v1, v0, Loo;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Loo;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Loo;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Loo;-><init>(Lqo;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Loo;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Loo;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v3

    .line 45
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p3, Ltp1;->a:Lnf1;

    .line 49
    .line 50
    sget-object p3, Lye1;->Z:Lye1;

    .line 51
    .line 52
    new-instance v1, Lpo;

    .line 53
    .line 54
    invoke-direct {v1, p0, p1, p2, v3}, Lpo;-><init>(Lqo;Ljava/lang/String;[Ljava/lang/String;Lq51;)V

    .line 55
    .line 56
    .line 57
    iput v2, v0, Loo;->h0:I

    .line 58
    .line 59
    invoke-static {p3, v1, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    sget-object p0, Lc71;->X:Lc71;

    .line 64
    .line 65
    if-ne p3, p0, :cond_3

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_3
    :goto_1
    check-cast p3, Lsj6;

    .line 69
    .line 70
    iget-object p0, p3, Lsj6;->X:Ljava/lang/Object;

    .line 71
    .line 72
    return-object p0
.end method
